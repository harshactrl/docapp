package com.edocapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edocapp.dto.Country;
import com.edocapp.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	
	public List<Country> getAllCountries(){
		
		return countryRepository.findAll();
	}
	
	
}
