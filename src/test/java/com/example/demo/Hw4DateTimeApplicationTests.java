package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org. springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Hw4DateTimeApplicationTests {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TimeZoneControllerTest.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}

}
