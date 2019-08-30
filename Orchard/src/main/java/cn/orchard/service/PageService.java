package cn.orchard.service;

import cn.orchard.vo.Page;

/**
 * 分页层
 * @author Riyas
 *
 * @param <T>
 */
public interface PageService<T> {
	 Page<T> findPageObjects(
			 Integer pageCurrent,
			 String username);
}
/*
 * public PageObject<SysRole> findPageObjects(Integer pageCurrent, String name) {
		//1.参数校验
		if(pageCurrent==null||pageCurrent<1)
		throw new IllegalArgumentException("当前页码不正确");
		//2.查询总记录数并进行验证
		int rowCount=sysRoleDao.getRowCount(name);
		if(rowCount==0)
	    throw new ServiceException("没有记录");
		//3.查询当前页记录
		int pageSize=3;
		int startIndex=(pageCurrent-1)*pageSize;
		List<SysRole> records=
	    sysRoleDao.findPageObjects(name, 
	    	startIndex, pageSize);
		//4.进行封装并返回
		PageObject<SysRole> po =
		PageUtil.newInstance(pageCurrent, rowCount, pageSize, records);
		return po;
	}
	*/
