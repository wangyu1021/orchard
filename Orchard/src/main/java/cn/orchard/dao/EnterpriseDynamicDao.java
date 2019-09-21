package cn.orchard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.orchard.pojo.EnterpriseDynamic;

public interface EnterpriseDynamicDao {
	/**
	 * 添加公司动态
	 * @param enterpriseDynamic
	 */
	void insertEnterpriseDynamic(EnterpriseDynamic enterpriseDynamic);
	/**
	 * 查询动态数量
	 * @param name
	 * @return
	 */
	int getRowCount();
	/**
	 * 分页查询
	 * @param name
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	List<EnterpriseDynamic> findPageObjects(@Param("startIndex") int startIndex,@Param("pageSize") int pageSize);
	
}
