package cn.orchard.service;

import java.util.List;

import cn.orchard.pojo.EnterpriseDynamic;

public interface EnterpriseDynamicService {
	List<EnterpriseDynamic> finEnterpriseDynamic();

	void addEnterpriseDynamic(EnterpriseDynamic enterpriseDynamic);
}
