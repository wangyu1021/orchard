package cn.orchard.dao;

import cn.orchard.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProductDao {

    int getRowCount();

    List<Product> findPageObjects(@Param("startIndex") int startIndex,@Param("pageSize") int pageSize);

	void insertProduct(Product product);

	List<Product> selectProductByName(String name);

	void deleteProduct(int id);
}
