package cn.orchard.service;

import cn.orchard.pojo.TradeLeads;
import cn.orchard.vo.Page;

public interface TradeLeadsService {

	Page<TradeLeads> findPageObjects(Integer pageCurrent);

	void addTradeLead(TradeLeads tradeLeads);


}
