package cn.orchard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.orchard.pojo.JsonResult;
import cn.orchard.pojo.Supplier;
import cn.orchard.service.SupplierService;
import cn.orchard.vo.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin
@RequestMapping("supplier")
@Api(value = "/supplier", tags = "供应商接口")
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
	
	
	@RequestMapping("/findSupplier.do")
	@ResponseBody
	@ApiOperation(value = "根据页码获取信息", notes = "根据页码获取信息", httpMethod = "GET", response = JsonResult.class)
	public JsonResult dofindSupplier(Integer pageCurrent) {
		JsonResult json = new JsonResult();
		try {
			Page<Supplier> page = supplierService.findPageObjects(pageCurrent);
			json.setState(1);
			json.setData(page);
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
}
