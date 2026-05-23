package com.rayees;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class calcTest {

	@Test
	public void test() {
		calc c=new calc();
		int actualres=c.divide(10, 5);
		int expectedres=2;
		assertEquals(expectedres,actualres);
	}

}
