package cn.orchard.service.impl;

import java.util.Date;
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
	public List<EnterpriseInformation> findEnterpriseInformation() {
		return enterpriseInformationDao.selectEnterpriseInformation();
	}
	public void updateEnterpriseInformation(EnterpriseInformation enterprise) {
		EnterpriseInformation enterpriseInformation = enterpriseInformationDao.selectEnterpriseInformationByNumber(enterprise.getNumber());
		if(enterpriseInformation==null) {
			throw new RuntimeException("无法修改");
		}
		enterprise.setUpdateTime(new Date());
		enterpriseInformationDao.updateEnterpriseInformation(enterprise);
	}
}
