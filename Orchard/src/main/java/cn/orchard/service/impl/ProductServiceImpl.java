package cn.orchard.service.impl;

import cn.orchard.dao.ProductDao;
import cn.orchard.pojo.Product;
import cn.orchard.service.ProductService;
import cn.orchard.util.PageUtil;
import cn.orchard.vo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    public Page<Product> findPageObjects(Integer pageCurrent) {
            //1.参数校验
            if(pageCurrent==null||pageCurrent<1)
                throw new IllegalArgumentException("当前页码不正确");
            //2.查询总记录数并进行验证
            int rowCount=productDao.getRowCount();
            if(rowCount==0)
                throw new RuntimeException("没有记录");
            //3.查询当前页记录
            int pageSize=16;
            int startIndex=(pageCurrent-1)*pageSize;
            List<Product> records=
                    productDao.findPageObjects(
                            startIndex, pageSize);
            //4.进行封装并返回
            Page<Product> po =
                    PageUtil.newInstance(pageCurrent, rowCount, pageSize, records);
            return po;

    }

	public void addProduct(Product product) {
		productDao.insertProduct(product);
	}

	public List<Product> findProductByName(String name) {
		List<Product> list = productDao.selectProductByName(name);
		if(list==null) {
			throw new RuntimeException("没有记录");
		}
		return list;
	}

	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
	}
}
