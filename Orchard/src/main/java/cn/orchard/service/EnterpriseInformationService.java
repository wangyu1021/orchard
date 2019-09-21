package cn.orchard.service;


import cn.orchard.pojo.EnterpriseInformation;
import cn.orchard.vo.Page;

public interface EnterpriseInformationService{
	/**
	 * 修改公司信息
	 * @param enterprise
	 */
	void updateEnterpriseInformation(EnterpriseInformation enterprise);
	
	 Page<EnterpriseInformation> findPageObjects(
			 Integer pageCurrent);
}
