package org.data;

import org.testng.annotations.Test;

public class B {
	@Test
	private void TestB1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TestB1");

	}
	@Test
	private void TestB2() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TestB2");

	}
	@Test
	private void TestB3() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TestB3");

	}
	@Test
	private void TestB4() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TestB4");

	}

}
