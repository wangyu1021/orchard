package cn.orchard.dao;

import java.util.List;

import cn.orchard.pojo.Contact;

public interface ContactDao {

	List<Contact> selectContact();

}
