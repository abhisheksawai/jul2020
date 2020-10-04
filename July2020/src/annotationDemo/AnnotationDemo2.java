package annotationDemo;

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
		System.out.println("beforesuit2");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method2");
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass2");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest2");
	}
	@Test
	public void verifyLogin()
	{
		System.out.println("Test Case - verifyLogin sop2");
	}
	
	@Test
	public void verifyLogin2()
	{
		System.out.println("Test Case2 - verifyLogin2 sop2");
	}

	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforetest2");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass2");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method2");
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("aftersuit2");
	}
}
