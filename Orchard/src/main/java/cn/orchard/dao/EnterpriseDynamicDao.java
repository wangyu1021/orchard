package cn.orchard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.orchard.pojo.EnterpriseDynamic;

public interface EnterpriseDynamicDao {

	List<EnterpriseDynamic> selectEnterpriseDynamic();

	void insertEnterpriseDynamic(@Param("enterpriseDynamic")EnterpriseDynamic enterpriseDynamic);
	
}
