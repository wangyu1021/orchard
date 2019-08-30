package cn.orchard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.orchard.dao.EnterpriseInformationDao;
import cn.orchard.pojo.EnterpriseInformation;
import cn.orchard.service.EnterpriseInformationService;

@Service
public class EnterpriseInformationServiceImpl implements EnterpriseInformationService {
	@Autowired
	private EnterpriseInformationDao enterpriseInformationDao;
	public List<EnterpriseInformation> findEnterprise() {
		return enterpriseInformationDao.selectEnterprise();
	}
	public void updateEnterprise(EnterpriseInformation enterprise) {
		enterpriseInformationDao.updateEnterprise(enterprise);
	}

}
