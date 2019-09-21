package cn.orchard.service;

import cn.orchard.pojo.LeaveMessage;
import cn.orchard.vo.Page;

public interface MessageService {

	void addMessage(LeaveMessage message);

	Page<LeaveMessage> findPageObjects(Integer pageCurrent);

}
