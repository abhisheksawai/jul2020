package faceBookPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginFacebookPage2 {
	
	// add all obejcts reatled lto that page
	By txt_username_fb_login = By.id("email");
	@FindBy (id="email") WebElement usernamefb;
	
	By password = By.xpath("//input[@id='pass']");
	By loginbutton = By.xpath("//button[@name='login']");
	
	//@FindBy(id="user_login")  @CacheLookup WebElement username; 
	
	WebDriver driver;
	// add methods related to above objects
	
	public LoginFacebookPage2(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void Enterusername(String username)
	{
		driver.findElement(txt_username_fb_login).sendKeys(username);
	}

	public void Enterpassword()
	{
		driver.findElement(password).sendKeys("Akash@4321");
	}
	
	public void ClickLoginButton()
	{
		driver.findElement(loginbutton).click();
		// you can assert here as well
	}
	
	
	public void ClickLogoutButton()
	{
		driver.findElement(loginbutton).click();
		// you can assert here as well
	}
	
	public void VerifyLogin() 
	{
		System.out.println("once got welcome msg that measn we are logged in successfully");
	}
	
}
