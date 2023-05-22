package com.cs.smoothieshop.controller;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class TestSmoothieUserController {

	@Autowired
	private MockMvc mvc;

	@Autowired
	WebApplicationContext webApplicationContext;

	@Autowired
	private ObjectMapper objectMapper;

	protected void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@org.junit.Test
	@Test
	public void getAllSmoothieDetailsTest() throws Exception {
		String uri = "/user/smoothieDetails";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		Assert.assertEquals(200, status);
		Assert.assertNotNull(mvcResult.getResponse().getContentAsString());
	}

}
