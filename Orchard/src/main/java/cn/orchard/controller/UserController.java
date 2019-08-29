package cn.orchard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.orchard.pojo.User;
import cn.orchard.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("findUser.do")
	public void findUser() {
		List<User> list = userService.findUser();
		System.out.println(list);
	}
	
}
