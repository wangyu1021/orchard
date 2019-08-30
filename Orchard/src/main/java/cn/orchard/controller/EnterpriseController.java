package cn.orchard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.orchard.pojo.EnterpriseInformation;
import cn.orchard.pojo.JsonResult;
import cn.orchard.service.EnterpriseInformationService;

@Controller
public class EnterpriseController {
	@Autowired
	private EnterpriseInformationService enterpriseInformationService;
	/**
	 * 获取公司信息
	 * @return
	 */
	@RequestMapping("findEnterpriseInformation.do")
	@ResponseBody
	public Map<String, Object> findEnterpriseInformation() {
		List<EnterpriseInformation> list = enterpriseInformationService.findEnterprise();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("enterprises", list);
		return map;
	}
	/**
	 * 修改公司信息
	 * @param enterpriseInformation
	 * @return
	 */
	@RequestMapping("updateEnterpriseInformation.do")
	@ResponseBody
	public JsonResult updateEnterprise(@ModelAttribute("enterpriseInformation") EnterpriseInformation enterpriseInformation) {
		JsonResult json=new JsonResult();
		try {
			enterpriseInformationService.updateEnterprise(enterpriseInformation);
			json.setState(1);
			json.setMessage("修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			json.setState(0);
			json.setMessage("修改失败");
		}
		return json;
	}
	/**
	 * 获取公司动态
	 */
	public Map<String, Object> findEnterpriseDynamic(){
		
		return null;
	}
}
