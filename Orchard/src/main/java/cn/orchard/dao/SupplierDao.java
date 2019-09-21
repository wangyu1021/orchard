package cn.orchard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.orchard.pojo.Supplier;

public interface SupplierDao {

	List<Supplier> findPageObjects(@Param("startIndex")int startIndex,@Param("pageSize") int pageSize);

	int getRowCount();

}
