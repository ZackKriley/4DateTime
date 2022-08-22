package com.example.demo;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TimeZoneController extends Timezone {
	
	private TimeZoneController timeZoneController;

		@RequestMapping(value = "/TimeZone", method = RequestMethod.POST, consumes = "application/json")
		public ZonedDateTime getZoneTime(@RequestBody Timezone timezone) {
			String tz = timezone.getTz();
			setId(ZoneId.of(tz));
			setTime(ZonedDateTime.now(getId()));
			return getTime();
		}
}
