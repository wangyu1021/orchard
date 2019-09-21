package cn.orchard.controller;

import cn.orchard.pojo.JsonResult;
import cn.orchard.pojo.Product;
import cn.orchard.vo.Page;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.orchard.service.FileService;
import cn.orchard.service.ProductService;
import cn.orchard.util.ReplaceNullUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@CrossOrigin
@Controller
@RequestMapping("product")
@Api(value = "/product", tags = "product接口")
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private FileService fileService;

	@RequestMapping("/findProduct.do")
	@ResponseBody
	@ApiOperation(value = "根据页码获取商品", notes = "根据页码获取商品", httpMethod = "GET", response = JsonResult.class)
	public JsonResult dofindProduct(Integer pageCurrent) {
		JsonResult json = new JsonResult();
		try {
			Page<Product> page = productService.findPageObjects(pageCurrent);
			json.setState(1);
			json.setData(page);
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}

	//实现文件上传
	@Transactional
	@RequestMapping("/addProduct.do")
	@ResponseBody
	@ApiOperation(value = "增加商品接口", notes = "增加商品接口", httpMethod = "POST", response = JsonResult.class)
	public JsonResult addProduct(@RequestBody Product product, @RequestParam(value="images",required=false)MultipartFile[] images) {
		JsonResult json=new JsonResult();
		try {
			if(images!=null) {
				String[] imageUrls= new String[images.length];
				for(int i=0;i<images.length;i++) {
					if(images[i]!=null) {
						String url=fileService.updateFile(images[i]).getUrl();
						imageUrls[i]=url;
					}
				}
				imageUrls=ReplaceNullUtil.replaceNull(imageUrls);
				String imageURL=String.join(",", imageUrls);
				product.setImage(imageURL);
			}
			productService.addProduct(product);
			json.setState(1);
			json.setMessage("上传成功");
		} catch (Exception e) {
			e.printStackTrace();
			json.setState(0);
			json.setMessage("上传失败");
		}
		return json;
	}
	@RequestMapping("/findProductByName.do")
	@ResponseBody
	@ApiOperation(value = "根据商品名称获取", notes = "根据商品名称获取", httpMethod = "GET", response = JsonResult.class)
	public JsonResult findProductByName(String name) {
		JsonResult json=new JsonResult();
		try {
			List<Product> list=productService.findProductByName(name);
			json.setState(1);
			json.setData(list);
		} catch (Exception e) {
			e.printStackTrace();
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
	@RequestMapping("/deleteProduct.do")
	@ResponseBody
	@ApiOperation(value = "删除商品", notes = "删除商品", httpMethod = "GET", response = JsonResult.class)
	public JsonResult deleteProduct(int id) {
		JsonResult json=new JsonResult();
		try {
			productService.deleteProduct(id);
			json.setState(1);
			json.setMessage("删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
		
	}
}
