package com.edocapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.boot.test.context.SpringBootTest;

import com.edocapp.controller.CountryController;

@SpringBootTest
public class SmokeTest {
	
	private CountryController controller;
	
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
