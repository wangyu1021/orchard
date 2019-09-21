package cn.orchard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.orchard.pojo.Contact;
import cn.orchard.pojo.JsonResult;
import cn.orchard.service.ContactService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Controller
@RequestMapping("contact")
@Api(value = "/contact", tags = "联系人接口")
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/findContact.do")
	@ResponseBody
	@ApiOperation(value = "获取联系人接口", notes = "获取联系人接口", httpMethod = "POST", response = JsonResult.class)
	public JsonResult findContact() {
		JsonResult json=new JsonResult();
		try {
			List<Contact> list=contactService.findContact();
			json.setState(1);
			json.setData(list);
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
}
