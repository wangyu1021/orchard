package cn.orchard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.orchard.pojo.EnterpriseInformation;

public interface EnterpriseInformationDao {
	/**
	 * 修改公司信息
	 * @param enterprise
	 */
	void updateEnterpriseInformation(EnterpriseInformation enterprise);

	EnterpriseInformation selectEnterpriseInformationByNumber(String number);
	/**
	 * 通过名字查询数量
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
	List<EnterpriseInformation> findPageObjects(@Param("startIndex") int startIndex,@Param("pageSize") int pageSize);
}
