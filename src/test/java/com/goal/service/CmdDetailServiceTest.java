package com.goal.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.goal.dto.CmdPicDTO;
import com.goal.form.CmdDetailForm;
import com.goal.form.CmdPicForm;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class CmdDetailServiceTest {

	private static Logger log = LoggerFactory.getLogger(CmdDetailServiceTest.class);
	@Resource
	private CmdDetailService s;
	@Autowired
	private CmdDetailService c;
	
	@Test
	public void testGetPicturesByCmdId(){
		log.info("start to test getPicturesByCmdId");

		CmdPicDTO dto = new CmdPicDTO();
		dto.setCmdId("wpf");
		dto.setShowAs("d"); //"p"
		
		List<CmdPicForm> list = s.getPicturesByCmdId(dto);
		list.stream().forEach(sf->System.out.println(sf.toString()));
	}
	
	@Test
	public void testGetCommodityByCmdId(){
		log.info("start to test getCommodityByCmdId");
		
		String cmdId = "wpf";
		CmdDetailForm form = c.getCommodityByCmdId(cmdId);
		System.out.println(form.toString());
	}

}
