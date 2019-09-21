package cn.orchard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.orchard.pojo.JsonResult;
import cn.orchard.pojo.LeaveMessage;
import cn.orchard.service.MessageService;
import cn.orchard.vo.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Controller
@RequestMapping("message")
@Api(value = "/message", tags = "message接口")
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@RequestMapping(value = "/addMessage.do" ,consumes = "application/json; charset=utf-8")
	@ResponseBody
	@ApiOperation(value = "添加留言", notes = "添加留言", httpMethod = "POST", response = JsonResult.class)
	public JsonResult addMessage(@RequestBody LeaveMessage message) {
		JsonResult json=new JsonResult();
		try {
			messageService.addMessage(message);
			json.setState(1);
			json.setMessage("添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			json.setState(0);
			json.setMessage("添加失败:"+e.getMessage());
		}
		return json;
	}
	@RequestMapping("/findMessage.do")
	@ResponseBody
	@ApiOperation(value = "根据页码获取信息", notes = "根据页码获取信息", httpMethod = "GET", response = JsonResult.class)
	public JsonResult dofindTradeLeads(Integer pageCurrent) {
		JsonResult json = new JsonResult();
		try {
			Page<LeaveMessage> page = messageService.findPageObjects(pageCurrent);
			json.setState(1);
			json.setData(page);
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
}
