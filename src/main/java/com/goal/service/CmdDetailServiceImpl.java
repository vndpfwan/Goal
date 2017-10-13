package com.goal.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.goal.dao.CmdParamDAO;
import com.goal.dao.CommodityDAO;
import com.goal.dao.PictureDAO;
import com.goal.dto.CmdPicDTO;
import com.goal.form.CmdDetailForm;
import com.goal.form.CmdParamForm;
import com.goal.form.CmdParamsForm;
import com.goal.form.CmdPicForm;
import com.goal.po.CmdParam;

@Component
public class CmdDetailServiceImpl implements CmdDetailService{

	@Resource
	PictureDAO pictureDAO;
	@Resource
	CommodityDAO cmdDAO;
	@Resource
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
	public List<CmdParamsForm> getCmdParamsByCmdId(String cmdId) {
		return paramDAO.getCmdParamsByCmdId(cmdId);
	}
	

}
