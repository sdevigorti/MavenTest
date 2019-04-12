package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotationsinTestNG {
	//to open browser
	@BeforeTest
	public void test1() {
		System.out.println("You are in your beforetest ");
	}
	@BeforeClass
	public void test2() {
		System.out.println("You are in your beforeclass ");
	}
	
	@BeforeMethod
	public void test3() {
		System.out.println("You are in your beforemethod");
	}
	
	
	@Test
	public void test4()
	{
		System.out.println("you are in your 1st test method");
	}
	
	@Test
	public void test5()
	{
		System.out.println("you are in your 2nd test method");
	}
	//to close browser
	@AfterTest
	public void test6() {
		System.out.println("You are in your aftertest ");
	}
	@AfterClass
	public void test7() {
		System.out.println("You are in your afterclass ");
	}
	
	@AfterMethod
	public void test8() {
		System.out.println("You are in your aftermethod");
	}
	

}
