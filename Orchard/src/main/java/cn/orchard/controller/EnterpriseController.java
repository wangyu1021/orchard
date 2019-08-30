package cn.orchard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.orchard.pojo.EnterpriseDynamic;
import cn.orchard.pojo.EnterpriseInformation;
import cn.orchard.pojo.JsonResult;
import cn.orchard.service.EnterpriseDynamicService;
import cn.orchard.service.EnterpriseInformationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
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
	 * 获取公司信息
	 * @return
	 */
	@RequestMapping("findEnterpriseInformation.do")
	@ResponseBody
	@ApiOperation(value = "获取企业信息", notes = "获取企业信息", httpMethod = "GET", response = Map.class)
	public Map<String, Object> findEnterpriseInformation() {
		List<EnterpriseInformation> list = enterpriseInformationService.findEnterpriseInformation();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("informationList", list);
		return map;
	}
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
	 * 获取公司动态
	 */
	@RequestMapping("findEnterpriseDynamic.do")
	@ResponseBody
	@ApiOperation(value = "获取公司动态", notes = "获取公司动态", httpMethod = "GET", response = Map.class)
	public Map<String, Object> findEnterpriseDynamic(){
		List<EnterpriseDynamic> list = enterpriseDynamicService.finEnterpriseDynamic();
		Map<String,Object> map=new HashMap<String ,Object>();
		map.put("dynamicList", list);
		return map;
	}
	/**
	 * 增加公司动态
	 */
	@RequestMapping("addEnterpriseDynamic.do")
	@ResponseBody
	@ApiOperation(value = "增加公司动态", notes = "增加公司动态", httpMethod = "GET", response = JsonResult.class)
	public JsonResult addEnterpriseDynamic(@ModelAttribute("enterpriseDynamic")EnterpriseDynamic enterpriseDynamic) {
		JsonResult json=new JsonResult();
		try {
			enterpriseDynamicService.addEnterpriseDynamic(enterpriseDynamic);
			json.setState(1);
			json.setMessage("添加动态成功");
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
}
