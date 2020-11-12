package com.traveldock;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;

	public List<Hotel> searchHotelsByHotelName(String hotelName){
		 return hotelRepository.findByhotelNameContaining(hotelName);
	}
	
	public List<Hotel> searchHotelsByCityId(String cityId){
		return hotelRepository.findBycityId(cityId);
	}
	
}
