package cn.orchard.dao;

import java.util.List;

import cn.orchard.pojo.EnterpriseInformation;

public interface EnterpriseInformationDao {
	/**
	 * 获取公司信息
	 * @return
	 */
	List<EnterpriseInformation> selectEnterprise();
	/**
	 * 修改公司信息
	 * @param enterprise
	 */
	void updateEnterprise(EnterpriseInformation enterprise);
}
