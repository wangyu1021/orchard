package cn.orchard.service;

import java.util.List;

import cn.orchard.pojo.EnterpriseInformation;

public interface EnterpriseInformationService {
	/**
	 * 获取公司信息
	 */
	List<EnterpriseInformation> findEnterpriseInformation();
	/**
	 * 修改公司信息
	 * @param enterprise
	 */
	void updateEnterpriseInformation(EnterpriseInformation enterprise);
}
