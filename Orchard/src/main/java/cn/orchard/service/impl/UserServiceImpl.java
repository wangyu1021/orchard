package cn.orchard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.orchard.dao.UserDao;
import cn.orchard.pojo.User;
import cn.orchard.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public List<User> findUser() {
		System.out.println(userDao.selectUser());
		return userDao.selectUser();
	}

}
