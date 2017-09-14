package com.goal.service;

import java.util.List;

import com.goal.dto.CmdPicDTO;
import com.goal.form.CmdDetailForm;
import com.goal.form.CmdParamForm;
import com.goal.form.CmdPicForm;

public interface CmdDetailService {

	List<CmdPicForm> getPicturesByCmdId(CmdPicDTO cmdPicDTO);
	
	CmdDetailForm getCommodityByCmdId(String cmdId);
	
	CmdParamForm getCmdParamsByCmdId(String cmdId);
}
