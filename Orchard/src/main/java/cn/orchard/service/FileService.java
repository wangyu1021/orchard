package cn.orchard.service;

import org.springframework.web.multipart.MultipartFile;

import cn.orchard.vo.ImageVO;


public interface FileService {

	ImageVO updateFile(MultipartFile uploadFile);

}
