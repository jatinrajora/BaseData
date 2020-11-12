package com.traveldock;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HotelDetailService {

	@Autowired
	private HotelDetailRepository hotelDetailRepository;
	
	public List<HotelDetail> getHotelDetail(int hotelId){
		
		return hotelDetailRepository.findByhotelId(hotelId);
	}
}
