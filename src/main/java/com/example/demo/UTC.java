package com.example.demo;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class UTC {
	
	private ZoneId id = ZoneId.ofOffset("UTC", ZoneOffset.of("+0"));

	public ZoneId getId() {
		return id;
	}

	public void setId(ZoneId id) {
		this.id = id;
	}
	
	public ZonedDateTime getTime() {
		return ZonedDateTime.now(getId());
	}
}
