package com.goal.dao;

import java.util.List;

import com.goal.dto.SerialDTO;
import com.goal.form.SerialsForm;
import com.goal.po.Serials;
import com.goal.po.SerialsExample;
/**
 * 系列DAO
 * @author lizhiwei
 *
 */
public interface SerialsDAO {

    int insert(Serials record);

    int insertSelective(Serials record);
	/**
	 * 通过系列id取得系列
	 * @param id
	 * @return
	 */
	public Serials getSerialsById(String id);
	
	/**
	 * 通过系列父id取得系列列表
	 * @param pId
	 * @return
	 */
//	public List<SerialsForm> getSerialsListByParentId(SerialDTO record);
	
	/**
	 * 根据SerialsExample取得系列集合
	 * @param example
	 * @return
	 */
	public List<SerialsForm> getSerialsListBySerialDTO(SerialsExample example);
	
}
