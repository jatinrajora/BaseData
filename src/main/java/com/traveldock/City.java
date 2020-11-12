package com.traveldock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class City {

	private int city_id;
	
	@Column(name = "city_name", nullable = false)
	private String cityName;
	
	public City() {
		
	}

	public City(int city_id, String cityName) {
		this.city_id = city_id;
		this.cityName = cityName;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
}
