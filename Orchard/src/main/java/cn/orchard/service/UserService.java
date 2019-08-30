package cn.orchard.service;

import java.util.List;

import cn.orchard.pojo.JsonResult;
import cn.orchard.pojo.User;

public interface UserService {
	public List<User> findUser();
	public void login(String username,String password);
}
