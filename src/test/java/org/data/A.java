package org.data;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	@Test
	private void TestA1() {
		System.out.println("TestA1");

	}
	
		@Test
		private void TestA2() {
			Assert.assertTrue(false);
			System.out.println("TestA2");

		}
		@Test
		private void TestA3() {
			System.out.println("TestA3");

		}
		

		

}
