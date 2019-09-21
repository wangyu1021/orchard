package cn.orchard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.orchard.pojo.LeaveMessage;

public interface MessageDao {

	void insertMessage(LeaveMessage leaveMessage);

	int getRowCount();

	List<LeaveMessage> findPageObjects(@Param("startIndex")int startIndex,@Param("pageSize") int pageSize);

}
