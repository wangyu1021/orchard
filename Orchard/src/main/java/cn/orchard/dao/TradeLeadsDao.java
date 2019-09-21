package cn.orchard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.orchard.pojo.TradeLeads;

public interface TradeLeadsDao {

	int getRowCount();

	List<TradeLeads> findPageObjects(@Param("startIndex")int startIndex,@Param("pageSize") int pageSize);

	void insertTradeLead(TradeLeads tradeLeads);

}
