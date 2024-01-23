package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {

	static Calculator cal = null;
	
	@BeforeAll
	static void before() {
		cal = new Calculator();
	}
	
	@Test
	@DisplayName("Add Test")
	@Tag("fast")
	void testAdd() {
		//Calculator cal = new Calculator();
		assertEquals(10, cal.add(5,5));
	}
	
	@Test
	@Tag("fast")
	void testSub() {
		//Calculator cal = new Calculator();
		assertEquals(4, cal.sub(6,2));
	}
	
	@Test
	@Disabled
	void testMul() {
		//Calculator cal = new Calculator();
		assertEquals(4, cal.mul(2,2));
	}

	@AfterAll
	static void after() {
		cal = null;
	}
	
}
