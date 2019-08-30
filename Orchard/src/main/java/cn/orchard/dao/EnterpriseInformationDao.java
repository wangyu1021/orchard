package cn.orchard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.orchard.pojo.EnterpriseInformation;

public interface EnterpriseInformationDao {
	/**
	 * 获取公司信息
	 * @return
	 */
	List<EnterpriseInformation> selectEnterpriseInformation();
	/**
	 * 修改公司信息
	 * @param enterprise
	 */
	void updateEnterpriseInformation(@Param("enterprise")EnterpriseInformation enterprise);
	
	EnterpriseInformation selectEnterpriseInformationByNumber(@Param("number")String number);
}
