package cn.orchard.service;

import java.util.List;

import cn.orchard.pojo.Product;
import cn.orchard.vo.Page;

public interface ProductService {

    Page<Product> findPageObjects(Integer pageCurrent);

	void addProduct(Product product);

	List<Product> findProductByName(String name);

	void deleteProduct(int id);
}
