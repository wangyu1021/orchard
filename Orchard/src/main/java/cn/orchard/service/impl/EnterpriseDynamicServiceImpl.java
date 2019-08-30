package cn.orchard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.orchard.dao.EnterpriseDynamicDao;
import cn.orchard.pojo.EnterpriseDynamic;
import cn.orchard.service.EnterpriseDynamicService;
@Service
public class EnterpriseDynamicServiceImpl implements EnterpriseDynamicService {
	@Autowired
	private  EnterpriseDynamicDao enterpriseDynamicDao;
	
	public List<EnterpriseDynamic> finEnterpriseDynamic() {
		return enterpriseDynamicDao.selectEnterpriseDynamic();
	}

	public void addEnterpriseDynamic(EnterpriseDynamic enterpriseDynamic) {
		if(enterpriseDynamic.getAuthor()==null || enterpriseDynamic.getContent()==null || enterpriseDynamic.getTitle()==null) {
			throw new RuntimeException("必填项不可为空");
		}
		enterpriseDynamicDao.insertEnterpriseDynamic(enterpriseDynamic);
	}

}
