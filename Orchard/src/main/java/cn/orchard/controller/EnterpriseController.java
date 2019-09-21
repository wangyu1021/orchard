package cn.orchard.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.orchard.pojo.EnterpriseDynamic;
import cn.orchard.pojo.EnterpriseInformation;
import cn.orchard.pojo.JsonResult;
import cn.orchard.service.EnterpriseDynamicService;
import cn.orchard.service.EnterpriseInformationService;
import cn.orchard.vo.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Controller
@RequestMapping("enterprise")
@Api(value = "/enterprise", tags = "Enterprise接口")
public class EnterpriseController {
	@Autowired
	private EnterpriseInformationService enterpriseInformationService;

	@Autowired
	private EnterpriseDynamicService enterpriseDynamicService;
	/**
	 * 修改公司信息
	 * @param enterpriseInformation
	 * @return
	 */
	@RequestMapping("updateEnterpriseInformation.do")
	@ResponseBody
	@ApiOperation(value = "修改公司信息", notes = "修改公司信息", httpMethod = "GET", response = JsonResult.class)
	public JsonResult updateEnterprise(@ModelAttribute("enterpriseInformation") EnterpriseInformation enterpriseInformation) {
		JsonResult json=new JsonResult();
		try {
			enterpriseInformationService.updateEnterpriseInformation(enterpriseInformation);
			json.setState(1);
			json.setMessage("修改成功");
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
	/**
	 * 增加公司动态
	 */
	@RequestMapping("addEnterpriseDynamic.do")
	@ResponseBody
	@ApiOperation(value = "增加公司动态", notes = "增加公司动态", httpMethod = "POST", response = JsonResult.class)
	public JsonResult addEnterpriseDynamic(@RequestBody(required = false) EnterpriseDynamic enterpriseDynamic) {
		JsonResult json=new JsonResult();
		try {
			System.out.println(enterpriseDynamic);
			enterpriseDynamicService.addEnterpriseDynamic(enterpriseDynamic);
			json.setState(1);
			json.setMessage("添加动态成功");
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
	@RequestMapping("doFindEnterpriseDynamicPage.do")
	@ResponseBody
	@ApiOperation(value = "公司动态分页查询", notes = "公司动态分页查询", httpMethod = "GET", response = JsonResult.class)
	public JsonResult doFindEnterpriseDynamicPage(Integer pageCurrent) {
		JsonResult json = new JsonResult();
		try {
			Page<EnterpriseDynamic> page = enterpriseDynamicService.findPageObjects(pageCurrent);
			json.setState(1);
			json.setData(page);
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}//将对象转换为json串时，都是访问get方法
	@RequestMapping("doFindEnterpriseInformationPage.do")
	@ResponseBody
	@ApiOperation(value = "公司简介分页查询", notes = "公司简介分页查询", httpMethod = "GET", response = JsonResult.class)
	public JsonResult doFindEnterpriseInformationPage(Integer pageCurrent) {
		JsonResult json = new JsonResult();
		try {
			Page<EnterpriseInformation> page = enterpriseInformationService.findPageObjects(pageCurrent);
			json.setState(1);
			json.setData(page);
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
}
