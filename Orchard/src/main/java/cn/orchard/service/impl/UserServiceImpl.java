package cn.orchard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.orchard.dao.UserDao;
import cn.orchard.pojo.JsonResult;
import cn.orchard.pojo.User;
import cn.orchard.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public List<User> findUser() {
		return userDao.selectUser();
	}
	public void login(String username, String password) {
		User user = userDao.selectUserByUserName(username);
		if(user==null) {
			throw new IllegalArgumentException("没有这个用户");
		}
		String pwd = user.getPassword();
		if(!pwd.equals(password)) {
			throw new IllegalArgumentException("密码错误");
		}
	}

}
