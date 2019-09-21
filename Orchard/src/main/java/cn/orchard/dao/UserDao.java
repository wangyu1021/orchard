package cn.orchard.dao;



import cn.orchard.pojo.User;

public interface UserDao {
	 User selectUserByUserName(String username);
}
