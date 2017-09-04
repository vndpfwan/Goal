package com.goal.service;

import java.util.List;

import com.goal.po.Serials;

/**
 * 系列服务
 * @author lizhiwei
 *
 */
public interface SerialsService {
	Serials getSerials(Serials serials);
	
	List<Serials> getSerialsListByParentId(Serials serials);
}
