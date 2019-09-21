package cn.orchard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.orchard.dao.ContactDao;
import cn.orchard.pojo.Contact;
import cn.orchard.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactDao contactDao;
	public List<Contact> findContact() {
		List<Contact> list=contactDao.selectContact();
		if(list.size()==0) {
			throw new RuntimeException("没有记录");
		}
		return list;
	}

}
