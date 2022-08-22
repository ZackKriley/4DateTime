package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UTCControllerTest {

	private UTCController utcController = new UTCController();
	
	@Test
	@DisplayName("Simple controller test")
	
	void testController() {
		ZoneId id = ZoneId.ofOffset("UTC", ZoneOffset.of("+0"));
		assertEquals(ZonedDateTime.now(id), utcController.getUTCTime(), "Check UTC time.");
	}
}
