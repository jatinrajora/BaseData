package com.traveldock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {

	private int hotel_id;
	
	@Column(name = "hotel_name", nullable = false)
	private String hotelName;
	
	@Column(name = "city_id", nullable = false)
	private String cityId;
	
	public Hotel() {
		
	}

	public Hotel(int hotel_id, String hotelName, String cityId) {
		this.hotel_id = hotel_id;
		this.hotelName = hotelName;
		this.cityId = cityId;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
}
