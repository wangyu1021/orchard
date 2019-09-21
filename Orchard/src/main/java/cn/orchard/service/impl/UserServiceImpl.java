package cn.orchard.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.orchard.dao.UserDao;
import cn.orchard.pojo.User;
import cn.orchard.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public void login(User user) {
		User usr = userDao.selectUserByUserName(user.getUsername());
		if(usr==null) {
			throw new IllegalArgumentException("没有这个用户");
		}
		String pwd = usr.getPassword();
		if(!pwd.equals(user.getPassword())) {
			throw new IllegalArgumentException("密码错误");
		}
	}

}
