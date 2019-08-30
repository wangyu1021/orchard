import org.junit.Before;
import org.junit.Test;

import cn.orchard.dao.UserDao;
import cn.orchard.pojo.User;

public class TestUserDao {
	@Before
	public void t() {
		System.out.println("asdas");
	}
	UserDao userDao;
	@Test
	public void TestFindUserByUserName() {
		User user = userDao.selectUserByUserName("admin");
		System.out.println(user);
	}
}
