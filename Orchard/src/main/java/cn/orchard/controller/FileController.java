package cn.orchard.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import cn.orchard.service.FileService;
import cn.orchard.vo.ImageVO;



public class FileController {
	
	@Autowired
	private FileService fileService;
	
	/**
	 * 	当用户上传完成时重定向到上传页面
	 * 思路:
	 * 	1.获取用户文件信息 包含文件名称
	 *  2.指定文件上传路径  if
	 *  3.实现文件上传
	 * @param fileImage
	 * @return
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	//@RequestMapping("/file")
	public String file(MultipartFile fileImage) throws IllegalStateException, IOException {
		//1.获取input标签中的name属性
		String inputName = fileImage.getName();
		System.out.println("1:"+inputName);
		//2.获取文件名称
		String fileName = fileImage.getOriginalFilename();
		//3.定义文件夹路径
		File fileDir = new File("E:/Image/");
		if(!fileDir.exists()) {
			//创建文件夹
			fileDir.mkdirs();
		}
		//4.实现文件上传
		fileImage.transferTo(new File("E:/Image/"+fileName));
		return "redirect:/file.jsp";
	}
	
	public ImageVO uploadFile(MultipartFile uploadFile) {
		return fileService.updateFile(uploadFile);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
