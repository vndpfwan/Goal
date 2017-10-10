package com.goal.dao;

import java.util.List;

import com.goal.dto.SerialDTO;
import com.goal.form.RecommendCmdForm;
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
	public List<SerialsForm> getSerialsListBySerialDTO(SerialDTO dto);
	
	/**
	 * 根据serial dto取得推荐商品列表
	 * @return
	 */
	public List<RecommendCmdForm> getRecommendCmdBySerialDTO(SerialDTO dto);
}
