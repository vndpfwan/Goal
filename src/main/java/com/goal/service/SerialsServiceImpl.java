package com.goal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.goal.dao.SerialsDAO;
import com.goal.po.Serials;
/**
 * 系列服务实现类
 * @author lizhiwei
 *
 */
public class SerialsServiceImpl implements SerialsService{

	@Autowired
	SerialsDAO serialsDAO;
	
	@Override
	public Serials getSerials(Serials serials) {
		return serialsDAO.getSerialsById(serials.getId());
	}

	@Override
	/**
	 * 通过父系列取得系列列表
	 */
	public List<Serials> getSerialsListByParentId(Serials serials) {
		return serialsDAO.getSerialsListByParentId(serials.getId());
	}

}
