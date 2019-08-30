package cn.orchard.user;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.orchard.dao.EnterpriseInformationDao;
import cn.orchard.pojo.EnterpriseInformation;

public class TestUserDao {
	@Autowired(required = false)
	@Qualifier("enterpriseInformationDao")
	EnterpriseInformationDao dao;
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(format.format(new Date()));
	}
	@Test
	public void test() {
		EnterpriseInformation enterprise=new EnterpriseInformation();
		enterprise.setWechat("王宇");
		dao.updateEnterpriseInformation(enterprise);
	}
}
