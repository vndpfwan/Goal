package com.goal.service;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.goal.dto.SerialDTO;
import com.goal.form.SerialsForm;
import com.goal.po.Serials;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class SerialsServiceTest {
	private static Logger log = LoggerFactory.getLogger(SerialsServiceTest.class);
	@Resource
	private SerialsService service;

	@Test
	public void testInsert() {
		log.info("test start for the serials insert...");
		try {
			Serials s = new Serials();
			s.setId(UUID.randomUUID().toString());
			s.setSerialLevel("1");
			s.setSerialName("hot");
			s.setSerialType("01");
			service.insert(s);
		} catch (Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();

		}
	}

	@Test
	public void testGetSerialsListByParentId() {
		log.info("test start for the getSerialsListByParentId()...");
		try {
			SerialDTO s = new SerialDTO();
			s.setSerialsId("123");
			List<SerialsForm> list = service.getSerialsListByParentId(s);
			list.stream().forEach(sf->System.out.println(sf.toString()));
		} catch (Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
	}
}
