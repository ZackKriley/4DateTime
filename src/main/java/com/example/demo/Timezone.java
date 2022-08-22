package com.example.demo;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Timezone {
	
	private String tz; //String that holds the time zone.
	private ZonedDateTime time = ZonedDateTime.now();
	private ZoneId id;
	
	public ZonedDateTime getTime() {
		return time;
	}
	public void setTime(ZonedDateTime time) {
		this.time = time;
	}
	
	public ZoneId getId() {
		System.out.println(id);
		return id;
	}
	
	//Matches the time zone string up with the current time zone.
	public void setId(ZoneId id) {
		this.id = id;
	}
	
	//Grabs the time zone string from the json file.
	//Example "tz" : "GMT"
	public String getTz() {
		return tz;
	}
	public void setTz(String tz) {
		this.tz = tz;
	}
}
