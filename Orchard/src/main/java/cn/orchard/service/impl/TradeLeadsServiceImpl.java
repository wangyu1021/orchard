package cn.orchard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.orchard.dao.TradeLeadsDao;
import cn.orchard.pojo.TradeLeads;
import cn.orchard.service.TradeLeadsService;
import cn.orchard.util.PageUtil;
import cn.orchard.vo.Page;

@Service
public class TradeLeadsServiceImpl implements TradeLeadsService {
	@Autowired
	private TradeLeadsDao tradeLeadsDao;

	public Page<TradeLeads> findPageObjects(Integer pageCurrent) {
		//1.参数校验
		if(pageCurrent==null||pageCurrent<1)
			throw new IllegalArgumentException("当前页码不正确");
		//2.查询总记录数并进行验证
		int rowCount=tradeLeadsDao.getRowCount();
		if(rowCount==0)
			throw new RuntimeException("没有记录");
		//3.查询当前页记录
		int pageSize=15;
		int startIndex=(pageCurrent-1)*pageSize;
		List<TradeLeads> records=
				tradeLeadsDao.findPageObjects(
						startIndex, pageSize);
		//4.进行封装并返回
		Page<TradeLeads> po =
				PageUtil.newInstance(pageCurrent, rowCount, pageSize, records);
		return po;

	}

	public void addTradeLead(TradeLeads tradeLeads) {
		tradeLeadsDao.insertTradeLead(tradeLeads);
	}
}	
