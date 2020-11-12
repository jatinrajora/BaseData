package com.traveldock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@RequestMapping(path = "/api/v1/hotels")
public class HotelSearchController {
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private CityService cityService;
	
	@Autowired 
	HotelDetailService hotelDetailService;
	
	@Autowired
	private ObjectMapper mapper;
	
	@GetMapping(path = "/search")
	public ObjectNode searchHotelOrCities(@RequestParam String hotelOrCityName) {
		
		ObjectNode responseObject = mapper.createObjectNode();
		
		List<Hotel> hotelList = hotelService.searchHotelsByHotelName(hotelOrCityName);
		
		List<City> cityList = cityService.searchCitiesByCityName(hotelOrCityName);
		
		if(hotelList != null) {
			ArrayNode hotelArray = mapper.createArrayNode();
			for(Hotel hotel : hotelList) {
				
				ObjectNode hotelObject = mapper.createObjectNode();
				hotelObject.put("id", hotel.getHotel_id());
				hotelObject.put("name", hotel.getHotelName());
				
				hotelArray.add(hotelObject);
			}
			responseObject.set("hotel", hotelArray);
		}
		
		if(cityList != null) {
			ArrayNode cityArray = mapper.createArrayNode();
			for(City city : cityList) {

				ObjectNode cityObject = mapper.createObjectNode();
				cityObject.put("id", city.getCity_id());
				cityObject.put("name", city.getCityName());
				
				cityArray.add(cityObject);
			}
			responseObject.set("city", cityArray);
		}
		
		return responseObject;
	}
	
	
	@GetMapping(path = "/search/cityId")
	public List<Hotel> searchHotelsByCityId(@RequestParam String cityId) {
		
		return hotelService.searchHotelsByCityId(cityId);
	}
	
	@GetMapping(path = "/detail")
	public ObjectNode getHotelDetailsByHotelId(@RequestParam int hotelId) {
		
		ObjectNode responseObject = mapper.createObjectNode();
		
		List<HotelDetail> hotelDetail = hotelDetailService.getHotelDetail(hotelId);
		
		if(hotelDetail != null) {
			ArrayNode detailArray = mapper.createArrayNode();
			for(HotelDetail detail : hotelDetail) {
				
				ObjectNode details = mapper.createObjectNode();
				details.put("id", detail.getHotelId());
				details.put("description", detail.getDescription());
				details.put("hotelRemark", detail.getHotelRemark());
				//details.put("lastUpdated", detail.getLastUpdated());
				details.put("starRating", detail.getStarRating());
				details.put("street1", detail.getStreet1());
				details.put("street2", detail.getStreet2());
				details.put("cityName", detail.getCityName());
				details.put("stateName", detail.getStateName());
				details.put("countryName", detail.getCountryName());
				details.put("zip", detail.getZip());
				details.put("website", detail.getWebsite());
				details.put("email", detail.getEmail());
				details.put("fax", detail.getFax());
				details.put("phone", detail.getPhone());
				details.put("latitude", detail.getLatitude());
				details.put("longitude", detail.getLongitude());
				//details.put("checkin", detail.getCheckin());
				//details.put("checkout", detail.getCheckout());
				details.put("address", detail.getAddress());
				
				detailArray.add(details);
			}
			responseObject.set("detail", detailArray);
		}
		
		return responseObject;
	}
}
