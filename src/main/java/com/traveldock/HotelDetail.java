package com.traveldock;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelDetail {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotel_id", nullable = false)
	private int hotelId;
	
	private String description;
	
	@Column(name = "hotel_remark", nullable = false)
	private String hotelRemark;

	@Column(name = "last_updated", nullable = false)
	private Date lastUpdated;
	
	@Column(name = "star_rating", nullable = false)
	private float starRating;
	
	private String street1, street2;
	
	@Column(name = "city_name", nullable = false)
	private String cityName;
	
	@Column(name = "state_name", nullable = false)
	private String stateName;
	
	@Column(name = "country_name", nullable = false)
	private String countryName;
	
	private String zip, website, email, fax, phone;
	
	private double latitude, longitude;
	
	private Time checkin, checkout;
	
	private String address;

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHotelRemark() {
		return hotelRemark;
	}

	public void setHotelRemark(String hotelRemark) {
		this.hotelRemark = hotelRemark;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public float getStarRating() {
		return starRating;
	}

	public void setStarRating(float starRating) {
		this.starRating = starRating;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public Time getCheckin() {
		return checkin;
	}

	public void setCheckin(Time checkin) {
		this.checkin = checkin;
	}

	public Time getCheckout() {
		return checkout;
	}

	public void setCheckout(Time checkout) {
		this.checkout = checkout;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public HotelDetail() {
		
	}

	public HotelDetail(int hotelId, String description, String hotelRemark, Date lastUpdated, float starRating,
			String street1, String street2, String cityName, String stateName, String countryName, String zip,
			String website, String email, String fax, String phone, double latitude, double longitude, Time checkin,
			Time checkout, String address) {

		this.hotelId = hotelId;
		this.description = description;
		this.hotelRemark = hotelRemark;
		this.lastUpdated = lastUpdated;
		this.starRating = starRating;
		this.street1 = street1;
		this.street2 = street2;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.zip = zip;
		this.website = website;
		this.email = email;
		this.fax = fax;
		this.phone = phone;
		this.latitude = latitude;
		this.longitude = longitude;
		this.checkin = checkin;
		this.checkout = checkout;
		this.address = address;
	}
	
}
