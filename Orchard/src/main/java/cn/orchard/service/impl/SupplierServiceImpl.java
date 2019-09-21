package cn.orchard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.orchard.dao.SupplierDao;
import cn.orchard.pojo.Supplier;
import cn.orchard.service.SupplierService;
import cn.orchard.util.PageUtil;
import cn.orchard.vo.Page;
@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierDao supplierDao;
	
	public Page<Supplier> findPageObjects(Integer pageCurrent) {
		//1.参数校验
		if(pageCurrent==null||pageCurrent<1)
			throw new IllegalArgumentException("当前页码不正确");
		//2.查询总记录数并进行验证
		int rowCount=supplierDao.getRowCount();
		if(rowCount==0)
			throw new RuntimeException("没有记录");
		//3.查询当前页记录
		int pageSize=15;
		int startIndex=(pageCurrent-1)*pageSize;
		List<Supplier> records=
				supplierDao.findPageObjects(
						startIndex, pageSize);
		//4.进行封装并返回
		Page<Supplier> po =
				PageUtil.newInstance(pageCurrent, rowCount, pageSize, records);
		return po;

	}
}
