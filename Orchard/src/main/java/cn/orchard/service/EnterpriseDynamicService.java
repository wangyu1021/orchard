package cn.orchard.service;


import cn.orchard.pojo.EnterpriseDynamic;
import cn.orchard.vo.Page;

public interface EnterpriseDynamicService {

	void addEnterpriseDynamic(EnterpriseDynamic enterpriseDynamic);
	Page<EnterpriseDynamic> findPageObjects(
			 Integer pageCurrent);
}
