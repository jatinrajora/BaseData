package com.traveldock;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CityService {

	@Autowired
	private CityRepository cityRepository;
	
	public List<City> searchCitiesByCityName(String cityName){
		return cityRepository.findBycityNameContaining(cityName);
	}
}
