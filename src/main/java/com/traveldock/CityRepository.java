package com.traveldock;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City, String> {

	public List<City> findBycityNameContaining(String cityName);
}
