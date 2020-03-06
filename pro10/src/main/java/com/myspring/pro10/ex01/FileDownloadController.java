package com.myspring.pro10.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FileDownloadController {
	private static String CURR_IMAGE_REPO_PATH = "D:\\jsp_workspace\\file_repo";
	
	@RequestMapping("/download")
	protected void download(
			@RequestParam("imageFileName") String imageFileName,
			HttpServletRequest request, HttpServletResponse response) throws Exception{
		OutputStream out = response.getOutputStream();
	
		String downFile = CURR_IMAGE_REPO_PATH + "\\" + imageFileName;
		File file = new File(downFile);
		
		response.setHeader("Cache-Control", "no-cache");
		response.addHeader("Content-disposition", "attachment; fileName="+imageFileName);
		FileInputStream in = new FileInputStream(file);
		
		byte[] buffer = new byte[1024*8];
		while(true) {
			int count = in.read(buffer);
			// 버퍼에 읽어들인 문자의 갯수
			if(count==-1) { // 버퍼의 마지막에 도달
				break;
			}
			out.write(buffer, 0, count);
		}
		out.close();
		in.close();
	}
}








