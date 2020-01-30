/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pel2.dto;

import java.util.Map;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author softechie (Suresh V)
 */
@Component
@Document
public class Airport {
	
	@Id
	@Field
    private String id;
	@Field
	private String airportname;
	@Field
	private String city;
	@Field
	private String country;
	@Field
	private String faa;
	@Field
	private Map geo;
	@Field
	private String icao;
	@Field("tz")
	private String timezone;
	@Field
	private String type;
    
  	public Airport(String id, String airportname, String city, String country, String faa, String icao,
			String timezone, String type) {
  		
		super();
		this.id = id;
		this.airportname = airportname;
		this.city = city;
		this.country = country;
		this.faa = faa;
//		this.geo = geo;
		this.icao = icao;
		this.timezone = timezone;
		this.type = type;
	}

	public Airport() {
    }
  	
  	public String toString() {
  		String printBean = "type="+type+" id="+id+" airportname="+airportname+
  				" city="+city+" country="+country+" faa="+faa+" icao="+icao+" tz="+timezone;
//  				+"geo ="+geo.toString();
  		return printBean;
  	}

	public String getId() {
		return id;
	}

	public String getAirportname() {
		return airportname;
	}

	public void setAirportname(String airportname) {
		this.airportname = airportname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFaa() {
		return faa;
	}

	public void setFaa(String faa) {
		this.faa = faa;
	}

	public Map getGeo() {
		return geo;
	}

	public void setGeo(Map geo) {
		this.geo = geo;
	}

	public String getIcao() {
		return icao;
	}

	public void setIcao(String icao) {
		this.icao = icao;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
  	
  }
  	  

