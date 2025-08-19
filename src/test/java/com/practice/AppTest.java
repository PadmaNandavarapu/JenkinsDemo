package com.practice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AppTest {
	
	@Test
	public void TestGreet() {
		String result = App.greet("Padhu");
		assertEquals("Hello, Padhu!", result);
	}

}
