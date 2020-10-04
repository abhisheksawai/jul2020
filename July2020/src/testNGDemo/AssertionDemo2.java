package testNGDemo;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo2 {
	
	
	@Test
	public void softAssert()
	{
		System.out.println("Test softAssert started");
		
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(10, 130);
		
		System.out.println("Test softAssert some code");
		System.out.println("Test softAssert ended");
		
		//assertion.assertAll();
	}
	
	@Test
	public void hardassert()
	{
		System.out.println("Test 2 started");
		
		int a=10;   // actual
		int b=10;  // expected

		Assert.assertEquals(a, b);
		
		System.out.println("Test 2 some code");
		System.out.println("Test 2 ended");
	}

}
