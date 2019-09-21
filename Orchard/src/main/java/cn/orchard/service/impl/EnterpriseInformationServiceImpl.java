package cn.orchard.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.orchard.dao.EnterpriseInformationDao;
import cn.orchard.pojo.EnterpriseInformation;
import cn.orchard.service.EnterpriseInformationService;
import cn.orchard.util.PageUtil;
import cn.orchard.vo.Page;

@Service
public class EnterpriseInformationServiceImpl implements EnterpriseInformationService {
	@Autowired
	private EnterpriseInformationDao enterpriseInformationDao;
	
	public void updateEnterpriseInformation(EnterpriseInformation enterprise) {
		EnterpriseInformation enterpriseInformation = enterpriseInformationDao.selectEnterpriseInformationByNumber(enterprise.getNumber());
		if(enterpriseInformation==null) {
			throw new RuntimeException("无法修改");
		}
		enterprise.setUpdate_time(new Date());
		enterpriseInformationDao.updateEnterpriseInformation(enterprise);
	}
	public Page<EnterpriseInformation> findPageObjects(Integer pageCurrent) {
		//1.参数校验
		if(pageCurrent==null||pageCurrent<1)
			throw new IllegalArgumentException("当前页码不正确");
		//2.查询总记录数并进行验证
		int rowCount=enterpriseInformationDao.getRowCount();
		if(rowCount==0)
			throw new RuntimeException("没有记录");
		//3.查询当前页记录
		int pageSize=10;
		int startIndex=(pageCurrent-1)*pageSize;
		List<EnterpriseInformation> records=
				enterpriseInformationDao.findPageObjects(
						startIndex, pageSize);
		//4.进行封装并返回
		Page<EnterpriseInformation> po =
				PageUtil.newInstance(pageCurrent, rowCount, pageSize, records);
		return po;
	}
}
