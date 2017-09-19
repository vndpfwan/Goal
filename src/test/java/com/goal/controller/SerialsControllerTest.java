package com.goal.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class SerialsControllerTest extends GenericControllerTest{

	@Test
	public void testGetSliderList() throws Exception {
		//judge the response code and forward url
		getMockMvc().perform(get("/homepage/serials/sliders")).andDo(print()).andExpect(status().is2xxSuccessful());
	}
	
	@Test
	public void testGetRecommendCmdBySerialId() throws Exception {
		//judge the response code and forward url
		getMockMvc().perform(get("/homepage/serials/recommend")).andDo(print()).andExpect(status().is2xxSuccessful());
	}
}
