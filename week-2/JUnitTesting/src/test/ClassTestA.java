package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClassTestA {

		@Test
		@Tag("development")
		@Tag("production")
		public void testA(TestInfo testInfo) {
			System.out.println("testA() called");
		}

	
}
