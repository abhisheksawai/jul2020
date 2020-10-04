package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProdDemo {

	@Test(dataProvider="datatopass")
	public void loginusingdata(String uname , String password)
	{
		System.out.println("data coming from data provider as "+uname+" "+password);
		System.out.println("login using data");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
	}
	
	@DataProvider
	public Object[][] datatopass()
	{
		Object arr[][] = new Object[2][2];
		arr[0][0] = "abhishek";
		arr[0][1] = "pass@1234";
		arr[1][0] = "alind";
		arr[1][1] = "india@1234";
		
		return arr;
		
	}
	
	
}
