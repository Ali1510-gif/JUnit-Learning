package com.rayees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString r=new ReverseString();
		assertEquals("ila",r.reverseString("ali"));
		assertEquals("avaJ",r.reverseString("Java"));
	}

}
