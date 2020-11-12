package com.traveldock;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelDetailRepository extends JpaRepository<HotelDetail, Integer> {
	
	public List<HotelDetail> findByhotelId(int hotelId);
}
