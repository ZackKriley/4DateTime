package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.when;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@SpringBootTest
public class TimeZoneControllerTest {
	
	@Autowired
	private Timezone timeZone = new Timezone();
	
	private TimeZoneController timeZoneController;
	
	@Test
	void testGmtZone() {
		ZoneId id = ZoneId.of("GMT");
		when(timeZoneController.getZoneTime(timeZone)).thenReturn(ZonedDateTime.now(id));
		
		Assert.assertEquals(timeZoneController.getZoneTime(timeZone), ZonedDateTime.now(id));
	}
	
}
