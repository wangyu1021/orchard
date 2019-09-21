package cn.orchard.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.orchard.dao.EnterpriseDynamicDao;
import cn.orchard.pojo.EnterpriseDynamic;
import cn.orchard.service.EnterpriseDynamicService;
import cn.orchard.util.PageUtil;
import cn.orchard.vo.Page;
@Service
public class EnterpriseDynamicServiceImpl implements EnterpriseDynamicService {
	@Autowired
	private  EnterpriseDynamicDao enterpriseDynamicDao;


	public void addEnterpriseDynamic(EnterpriseDynamic enterpriseDynamic) {
		if(enterpriseDynamic.getAuthor()==null || enterpriseDynamic.getContent()==null || enterpriseDynamic.getTitle()==null) {
			throw new RuntimeException("必填项不可为空");
		}
		enterpriseDynamic.setUpdate_time(new Date());
		System.out.println(enterpriseDynamic.getUpdate_time());
		enterpriseDynamic.setCreated_time(new Date());
		enterpriseDynamic.setState("1");
		enterpriseDynamic.setEnterprise_number("M201903292021547535922");
		System.out.println(enterpriseDynamic);
		enterpriseDynamicDao.insertEnterpriseDynamic(enterpriseDynamic);
	}

	public Page<EnterpriseDynamic> findPageObjects(Integer pageCurrent) {
		//1.参数校验
		if(pageCurrent==null||pageCurrent<1)
			throw new IllegalArgumentException("当前页码不正确");
		//2.查询总记录数并进行验证
		int rowCount=enterpriseDynamicDao.getRowCount();
		if(rowCount==0)
			throw new RuntimeException("没有记录");
		//3.查询当前页记录
		int pageSize=10;
		int startIndex=(pageCurrent-1)*pageSize;
		List<EnterpriseDynamic> records=
				enterpriseDynamicDao.findPageObjects(
						startIndex, pageSize);
		//4.进行封装并返回
		Page<EnterpriseDynamic> po =
				PageUtil.newInstance(pageCurrent, rowCount, pageSize, records);
		return po;
	}

}
