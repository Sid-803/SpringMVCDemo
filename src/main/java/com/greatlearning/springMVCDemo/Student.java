package com.greatlearning.springMVCDemo;
import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countries;
	private String favoriteLanguage;
	private String[] operatingSystem;
	
	public Student() {
		countries=new LinkedHashMap<>();
		countries.put("IN", "INDIA");
		countries.put("UK", "United Kingdom");
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}
	public void setCountries(LinkedHashMap<String, String> countries) {
		this.countries = countries;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String[] getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String[] operatingSystems) {
		this.operatingSystem = operatingSystems;
	}
	
}
