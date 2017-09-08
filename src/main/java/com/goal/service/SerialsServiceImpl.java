package com.goal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goal.dao.SerialsDAO;
import com.goal.dto.SerialSliderDTO;
import com.goal.form.SerialsForm;
import com.goal.po.Serials;
/**
 * 系列服务实现类
 * @author lizhiwei
 *
 */
@Service
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
	public List<SerialsForm> getSerialsListByParentId(SerialSliderDTO dto) {
		return serialsDAO.getSerialsListByParentId(dto);
	}

	@Override
	/**
	 * 插入数据
	 */
	public int insert(Serials serials) {
		return serialsDAO.insertSelective(serials);
	}

}
