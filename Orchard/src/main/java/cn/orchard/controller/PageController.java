package cn.orchard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	/**
	 * 首页
	 * @return
	 */
	@RequestMapping("index.do")
	public String index() {
		return "index";
	}
	
}
