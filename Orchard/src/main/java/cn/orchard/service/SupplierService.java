package cn.orchard.service;

import cn.orchard.pojo.Supplier;
import cn.orchard.vo.Page;

public interface SupplierService {

	Page<Supplier> findPageObjects(Integer pageCurrent);

}
