package Testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
		int i=9/3;
	}
	@Test(dependsOnMethods="searchTest")
	public void addToCartTest() {
		System.out.println("addToCartTest");
		int i=9/0;
	}
	@Test(dependsOnMethods="addToCartTest")
	public void paymentTest() {
		System.out.println("paymentTest");
		
}
}