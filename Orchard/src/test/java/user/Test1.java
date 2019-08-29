package user;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.orchard.dao.UserDao;
import cn.orchard.pojo.User;
import cn.orchard.service.UserService;

public class Test1 {
	@Autowired
	private UserDao userDao;
	@Test
	public void findUser() {
		List<User> user = userDao.selectUser();
		for(User s:user) {
			System.out.println(s.toString());
		}
	}
}
