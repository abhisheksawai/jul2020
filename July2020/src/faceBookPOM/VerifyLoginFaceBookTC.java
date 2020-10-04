package faceBookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLoginFaceBookTC {
	
	@Test
	public void VerifyLoginFacebook()
	{
		// launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
	//	LoginFacebookPage lp = new LoginFacebookPage(driver);
	//	LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
		LoginFacebookPage lp = PageFactory.initElements(driver, LoginFacebookPage.class);
		
		
		lp.Enterusername("usernamefbToechck");
		lp.Enterpassword();
		lp.ClickLoginButton();
		lp.VerifyLogin();
		
	}	
	
}
