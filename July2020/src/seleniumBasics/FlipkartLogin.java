package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipkartLogin {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		
		
		Driver.findElementByXPath("//input[@type='text'])[2]").sendKeys("9874607110");
		  Driver.findElementByXPath("//input[@type='password']").sendKeys("100%Sutanay");
		  Driver.findElementByXPath("//input[@type='submit']").click();
		
	}

}
