package com.cs.smoothieshop.handler;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.cs.smoothieshop.entity.Smoothie;
import com.cs.smoothieshop.repository.SmoothieDao;

@SpringBootTest
@AutoConfigureMockMvc
public class TestSmoothieUserHandler {

	@InjectMocks
	SmoothieUserHandler handler;
	
	@Mock
	SmoothieDao dao;
	
	@org.junit.Test
	@Test
	public void getAllSmoothieDetailsTest() {
		List<Smoothie> smoothieList = new ArrayList<Smoothie>();
		Smoothie smoothie = new Smoothie();
		smoothie.setId(1);
		smoothie.setName("Blueberry Smoothie");
		smoothieList.add(smoothie);
		Mockito.when(dao.findAll()).thenReturn(smoothieList);
		Assert.assertNotNull(handler.getAllSmoothieDetails());
	}
}
