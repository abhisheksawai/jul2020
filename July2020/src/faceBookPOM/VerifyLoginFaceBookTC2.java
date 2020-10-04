package faceBookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLoginFaceBookTC2 {
	
	@Test
	public void VerifyLoginFacebook()
	{
		// launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		LoginFacebookPage lp = new LoginFacebookPage(driver);
		lp.Enterusername("Shishir");
		lp.Enterpassword();
		lp.ClickLoginButton();
		lp.VerifyLogin();
		
	}	
	
}
