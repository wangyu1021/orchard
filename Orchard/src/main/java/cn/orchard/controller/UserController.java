package cn.orchard.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.orchard.pojo.JsonResult;
import cn.orchard.service.UserService;
import io.swagger.annotations.Api;
/**
 * 目前无用
 * @author Riyas
 *
 */
@Controller
@RequestMapping("user")
@Api(value = "/user", tags = "User接口")
public class UserController {
	@Autowired
	private UserService userService;
	
	/**
	 * 登录
	 */
	@RequestMapping("login.do")
	@ResponseBody
	public JsonResult login(String username,String password) {
		JsonResult json=new JsonResult();
		try {
			userService.login(username, password);
			json.setState(1);
			json.setMessage("登录成功");
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
}
