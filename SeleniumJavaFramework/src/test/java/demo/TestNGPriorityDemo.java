package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("TEST 1111111111");
	}
	
	
	@Test(priority = 2)
	public void test2() {
		System.out.println("TEST  22222222222222");
	}

	@Test(priority = 3)
	public void test3() {
		System.out.println("TEST 33333333333333");
	}


	
}
