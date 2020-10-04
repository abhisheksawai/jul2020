package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	// STCM
	
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("beforesuit");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}

//	@AfterClass
//	public void afterclass()
//	{
//		System.out.println("afterclass");
//	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest");
	}
	@Test
	public void verifyLogin()
	{
		System.out.println("Test Case - verifyLogin sop");
	}
	
	@Test
	public void verifyLogin2()
	{
		System.out.println("Test Case2 - verifyLogin2 sop");
	}

//	@BeforeTest
//	public void beforetest()
//	{
//		System.out.println("beforetest");
//	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("aftersuit");
	}
}
