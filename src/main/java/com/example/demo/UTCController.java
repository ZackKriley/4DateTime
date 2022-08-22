package com.example.demo;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UTCController extends UTC {
	
	private UTCController utcController;
	
	//Returns the current time for the UTC time zone.
	@GetMapping("/UTCTime")
	public ZonedDateTime getUTCTime() {
		setId(ZoneId.ofOffset("UTC", ZoneOffset.of("+0")));
		return getTime();
	}
}
