package com.cs.smoothieshop.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cs.smoothieshop.entity.Smoothie;
import com.cs.smoothieshop.handler.SmoothieBusinessHandler;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class TestSmoothieBusinessController {

	@Autowired
	private MockMvc mvc;

	@Autowired
	WebApplicationContext webApplicationContext;
	
	@MockBean
	SmoothieBusinessHandler handler;

	@Autowired
	private ObjectMapper objectMapper;
	
	protected void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@org.junit.Test
	@Test
	public void getSmoothieDetailsTest() throws Exception {
		String uri = "/business/Blueberry Smoothie";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		Assert.assertEquals(200, status);
		Assert.assertNotNull(mvcResult.getResponse().getContentAsString());
	}
	
	@org.junit.Test
	@Test
	public void insertSmoothieDetailsTest() throws Exception {
		String uri = "/business/insertSmoothieDetails";
		Smoothie smoothie = new Smoothie();
		smoothie.setName("Blueberry Smoothie");
		String jsonSmoothie = objectMapper.writeValueAsString(smoothie);
		mvc.perform(MockMvcRequestBuilders.post(uri).content(jsonSmoothie).contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk());
	}
	
	@org.junit.Test
	@Test
	public void insertMultipleSmoothieDetailsTest() throws Exception {
		String uri = "/business/insertMultipleSmoothieDetails";
		List<Smoothie> smoothies = new ArrayList<>();
		Smoothie smoothie = new Smoothie();
		smoothie.setName("Blueberry Smoothie");
		smoothies.add(smoothie);
		String jsonSmoothie = objectMapper.writeValueAsString(smoothies);
		mvc.perform(MockMvcRequestBuilders.post(uri).content(jsonSmoothie).contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk());
	}
		
	
	@org.junit.Test
	@Test
	public void editSmoothieDetailsTest() throws Exception {
		String uri = "/business/editSmoothieDetails";
		Smoothie smoothie = new Smoothie();
		smoothie.setId(1);
		smoothie.setName("Blueberry Smoothie");
		String jsonSmoothie = objectMapper.writeValueAsString(smoothie);
		mvc.perform(MockMvcRequestBuilders.put(uri).content(jsonSmoothie).contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk());
	}
	
	@org.junit.Test
	@Test
	public void deleteSmoothieDetailsTest() throws Exception {
		String uri = "/business/deleteSmoothie/{name}";
		Mockito.doNothing().when(handler).deleteSmoothieDetails("Blueberry Smoothie");
		mvc.perform(MockMvcRequestBuilders.delete(uri, "Blueberry Smoothie").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk());
	}
}
