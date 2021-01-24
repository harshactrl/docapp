package com.edocapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edocapp.dto.Country;
import com.edocapp.services.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	@ResponseBody
	public Iterable<Country> getAll(){
		
		return countryService.getAllCountries();
	}
	
}
