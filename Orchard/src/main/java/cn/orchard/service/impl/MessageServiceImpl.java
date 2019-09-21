package cn.orchard.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.orchard.dao.MessageDao;
import cn.orchard.pojo.LeaveMessage;
import cn.orchard.service.MessageService;
import cn.orchard.util.PageUtil;
import cn.orchard.vo.Page;

@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	private MessageDao messageDao;
	
	
	public void addMessage(LeaveMessage message) {
		message.setCreated_time(new Date());
		if(message.getPhone().length()!=11) {
			throw new RuntimeException("请输入正确的电话号码");
		}
		if(!message.getEmail().matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")) {
			throw new RuntimeException("邮箱格式不正确");
		}
		messageDao.insertMessage(message);
	}
	public Page<LeaveMessage> findPageObjects(Integer pageCurrent) {
		//1.参数校验
		if(pageCurrent==null||pageCurrent<1)
			throw new IllegalArgumentException("当前页码不正确");
		//2.查询总记录数并进行验证
		int rowCount=messageDao.getRowCount();
		if(rowCount==0)
			throw new RuntimeException("没有记录");
		//3.查询当前页记录
		int pageSize=15;
		int startIndex=(pageCurrent-1)*pageSize;
		List<LeaveMessage> records=
				messageDao.findPageObjects(
						startIndex, pageSize);
		//4.进行封装并返回
		Page<LeaveMessage> po =
				PageUtil.newInstance(pageCurrent, rowCount, pageSize, records);
		return po;

	}

}
