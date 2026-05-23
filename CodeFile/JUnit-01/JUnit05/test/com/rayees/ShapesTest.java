package com.rayees;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes s = new Shapes();

	@Test
	void testComputeSquareArea() {

		assertEquals(576, s.computeSquareArea(24));
	}

	@Test
	void testComputeCircleArea() {

		assertEquals(78.5, s.computeCircleArea(5));
	}

}
