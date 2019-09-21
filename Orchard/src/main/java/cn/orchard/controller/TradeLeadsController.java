package cn.orchard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.orchard.pojo.JsonResult;
import cn.orchard.pojo.TradeLeads;
import cn.orchard.service.TradeLeadsService;
import cn.orchard.vo.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Controller
@RequestMapping("tradeLeads")
@Api(value = "/tradeLeads", tags = "tradeLeads接口")
public class TradeLeadsController {
	@Autowired
	private TradeLeadsService tradeLeadsService;

	@RequestMapping("/findTradeLeads.do")
	@ResponseBody
	@ApiOperation(value = "根据页码获取信息", notes = "根据页码获取信息", httpMethod = "GET", response = JsonResult.class)
	public JsonResult dofindTradeLeads(Integer pageCurrent) {
		JsonResult json = new JsonResult();
		try {
			Page<TradeLeads> page = tradeLeadsService.findPageObjects(pageCurrent);
			json.setState(1);
			json.setData(page);
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
	@RequestMapping("/addTradeLead.do")
	@ResponseBody
	@ApiOperation(value = "增加供求信息", notes = "增加供求信息", httpMethod = "POST", response = JsonResult.class)
	public JsonResult addTradeLead(@RequestBody(required = false) TradeLeads tradeLeads) {
		JsonResult json = new JsonResult();
		try {
			tradeLeadsService.addTradeLead(tradeLeads);
			json.setState(1);
			json.setMessage("添加成功");
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}

}
