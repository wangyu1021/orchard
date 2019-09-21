package cn.orchard.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.orchard.pojo.JsonResult;
import cn.orchard.pojo.User;
import cn.orchard.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@CrossOrigin
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
	@ApiOperation(value = "登录接口", notes = "登录接口", httpMethod = "POST", response = JsonResult.class)
	public JsonResult login(@RequestBody User user) {
		JsonResult json=new JsonResult();
		try {
			userService.login(user);
			json.setState(1);
			json.setMessage("登录成功");
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
	
}
