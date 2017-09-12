package com.goal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<SerialsForm> getSerialsListByParentId(SerialDTO dto) {
		return getSerialsListBySerialDTO(dto);
	}

	/**
	 * 通过dto对象取得serialsForm集合
	 * @param dto
	 * @return
	 */
	private List<SerialsForm> getSerialsListBySerialDTO(SerialDTO dto) {
		SerialsExample se = new SerialsExample();
		if(!StringUtil.isEmpty(dto.getpSerialsId())){
			se.createCriteria().andPSerialIdEqualTo(dto.getpSerialsId());
		}
		if(!StringUtil.isEmpty(dto.getSerialsId())){
			se.createCriteria().andPSerialIdEqualTo(dto.getSerialsId());
		}
		return serialsDAO.getSerialsListBySerialDTO(se);
	}
	
	@Override
	/**
	 * 插入数据
	 */
	public int insert(Serials serials) {
		return serialsDAO.insertSelective(serials);
	}

	@Override
	public List<RecommendCmdForm> getRecommendCmdBySerialsId(SerialDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
