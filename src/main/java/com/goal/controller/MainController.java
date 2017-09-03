package com.goal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goal.form.MainCmdForm;

@Controller
@RequestMapping(value="/list")
public class MainController extends AbstractController {

	@RequestMapping(value="/all")
	@ResponseBody
	public Object listAllCmd() {
		List<MainCmdForm> list = new ArrayList<MainCmdForm>();
		//list.add();
		return list;
	}
}
