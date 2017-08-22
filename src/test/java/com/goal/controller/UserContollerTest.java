package com.goal.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * unit test for controller(attention: this mock need server runtime library )
 * 
 * @author lizhiwei
 *
 */
public class UserContollerTest extends GenericControllerTest{
	
//	private MockHttpServletRequest request;
//	
//	private MockHttpServletResponse response;
//	
//	@Before
//	private void init() {
//		request= new MockHttpServletRequest();
//		response = new MockHttpServletResponse();
//	}
	@Test
	public void testHelloWorld() throws Exception {
		//judge the response code and forward url
		getMockMvc().perform(get("/hello/index")).andDo(print()).andExpect(status().is2xxSuccessful())
				.andExpect(MockMvcResultMatchers.forwardedUrl("/WEB-INF/jsp/index.jsp"));
	}
}
