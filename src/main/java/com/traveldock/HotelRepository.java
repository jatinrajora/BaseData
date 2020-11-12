package com.traveldock;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
	
	public List<Hotel> findByhotelNameContaining(String hotelName);
	public List<Hotel> findBycityId(String cityId);
}
