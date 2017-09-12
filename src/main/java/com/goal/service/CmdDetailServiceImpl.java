package com.goal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goal.dao.CmdParamDAO;
import com.goal.dao.CommodityDAO;
import com.goal.dao.PictureDAO;
import com.goal.dto.CmdPicDTO;
import com.goal.form.CmdDetailForm;
import com.goal.form.CmdParamForm;
import com.goal.form.CmdPicForm;
import com.goal.po.CmdParam;

@Service
public class CmdDetailServiceImpl implements CmdDetailService{

	@Autowired
	PictureDAO pictureDAO;
	@Autowired
	CommodityDAO cmdDAO;
	@Autowired
	CmdParamDAO paramDAO;


	@Override
	public List<CmdPicForm> getPicturesByCmdId(CmdPicDTO cmdPicDTO) {
		return pictureDAO.getPicturesByCmdId(cmdPicDTO);
	}

	@Override
	public CmdDetailForm getCommodityByCmdId(String cmdId) {
		return cmdDAO.getCommodityByCmdId(cmdId);
	}

	@Override
	public CmdParamForm getCmdParamsByCmdId(String cmdId) {
		List<CmdParam> items = paramDAO.getCmdParamsByCmdId(cmdId);
		CmdParamForm form = new CmdParamForm();
		for (CmdParam item : items) {
			if("smartType".equals(item.getCmdKey()))
				form.setSmartType(item.getCmdValue());
			else if("warranty".equals(item.getCmdKey()))
				form.setWarranty(item.getCmdValue());
			else if("size".equals(item.getCmdKey()))
				form.setSize(item.getCmdValue());
			else if("area".equals(item.getCmdKey()))
				form.setArea(item.getCmdValue());
			else if("source".equals(item.getCmdKey()))
				form.setSource(item.getCmdValue());
			else if("power".equals(item.getCmdKey()))
				form.setPower(item.getCmdValue());
			else if("space".equals(item.getCmdKey()))
				form.setSpace(item.getCmdValue());
			else if("style".equals(item.getCmdKey()))
				form.setStyle(item.getCmdValue());
			else if("shape".equals(item.getCmdKey()))
				form.setShape(item.getCmdValue());
			else if("sale".equals(item.getCmdKey()))
				form.setSale(item.getCmdValue());
		}
		return form;
	}
	

}
