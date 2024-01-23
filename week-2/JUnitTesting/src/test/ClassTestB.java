package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClassTestB {


	@Test
	@Tag("production")
	public void testA(TestInfo testInfo) {
		System.out.println("testA() called");
	}

}
