package cn.orchard.service;

import cn.orchard.vo.Page;

/**
 * 分页层
 * @author Riyas
 *
 * @param <T>
 */
public interface PageService<T> {
	 Page<T> findPageObjects(
			 Integer pageCurrent,
			 String username);
}
