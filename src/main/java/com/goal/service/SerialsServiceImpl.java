package com.goal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.goal.dao.SerialsDAO;
import com.goal.dto.SerialDTO;
import com.goal.form.RecommendCmdForm;
import com.goal.form.SerialsForm;
import com.goal.po.Serials;
import com.goal.po.SerialsExample;
import com.goal.util.StringUtil;
/**
 * 系列服务实现类
 * @author lizhiwei
 *
 */
@Component
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
	public List<SerialsForm> getSerialsListByParentId(SerialDTO dto) {
		return getSerialsListBySerialDTO(dto);
	}

	/**
	 * 通过dto对象取得serialsForm集合
	 * @param dto
	 * @return
	 */
	private List<SerialsForm> getSerialsListBySerialDTO(SerialDTO dto) {
		return serialsDAO.getSerialsListBySerialDTO(dto);
	}
	
	@Override
	/**
	 * 插入数据
	 */
	public int insert(Serials serials) {
		return serialsDAO.insertSelective(serials);
	}

	@Override
	/**
	 *  通过dto对象取得推荐商品集合
	 */
	public List<RecommendCmdForm> getRecommendCmdBySerialsId(SerialDTO dto) {
//		SerialsExample se = new SerialsExample();
//		if(!StringUtil.isEmpty(dto.getSerialsId())){
//			se.createCriteria().andIdEqualTo(dto.getSerialsId());
//		}
		return serialsDAO.getRecommendCmdBySerialDTO(dto);
	}

}
