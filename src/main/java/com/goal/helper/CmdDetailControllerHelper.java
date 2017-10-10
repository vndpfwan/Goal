package com.goal.helper;

import java.util.List;

import javax.annotation.Resource;

import com.goal.dto.CmdPicDTO;
import com.goal.form.CmdDetailForm;
import com.goal.form.CmdParamForm;
import com.goal.form.CmdPicForm;
import com.goal.service.CmdDetailService;

public class CmdDetailControllerHelper extends GenericControllerHelper{

	@Resource
	CmdDetailService cmdDetailService;
	
	public List<CmdPicForm> getDisplayPicturesByCmdId(String cmdId,String showAs){
		CmdPicDTO cmdPicDTO = new CmdPicDTO();
		cmdPicDTO.setCmdId(cmdId);
		cmdPicDTO.setShowAs(showAs);
		List<CmdPicForm> list = cmdDetailService.getPicturesByCmdId(cmdPicDTO);
		list.parallelStream().forEach(dForm->dForm.setPicUrl(combinePictureUrl(dForm.getPicUrl())));
		return list;
	}

	public List<CmdPicForm> getDescriptonPicturesByCmdId(String cmdId,String showAs){
		CmdPicDTO cmdPicDTO = new CmdPicDTO();
		cmdPicDTO.setCmdId(cmdId);
		cmdPicDTO.setShowAs(showAs);
		List<CmdPicForm> list = cmdDetailService.getPicturesByCmdId(cmdPicDTO);
		list.parallelStream().forEach(dForm->dForm.setPicUrl(combinePictureUrl(dForm.getPicUrl())));
		return list;
	}
	
	public CmdDetailForm getCommodityByCmdId(String cmdId){
		return cmdDetailService.getCommodityByCmdId(cmdId);
	}
	
	public CmdParamForm getCmdParamsByCmdId(String cmdId){
		return cmdDetailService.getCmdParamsByCmdId(cmdId);
	}
}
