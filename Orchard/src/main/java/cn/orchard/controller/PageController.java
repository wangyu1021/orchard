package cn.orchard.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(tags = "Page接口")
public class PageController {
	/**
	 * 首页
	 * @return
	 */
	@RequestMapping("index.do")
	@ApiOperation(value = "首页", notes = "首页", httpMethod = "GET", response = String.class)
	public String index() {
		return "index";
	}
	
}
