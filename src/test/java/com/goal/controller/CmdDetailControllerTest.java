package com.goal.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import java.awt.print.Printable;

import org.junit.Test;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class CmdDetailControllerTest extends GenericControllerTest{

	@Test
	public void testGetDetailPictures() throws Exception{
		getMockMvc().perform(get("/detail/display/wpf")).andDo(print()).andExpect(status().is2xxSuccessful())
		.andExpect(MockMvcResultMatchers.forwardedUrl("/WEB-INF/jsp/index.jsp"));
	}
}
