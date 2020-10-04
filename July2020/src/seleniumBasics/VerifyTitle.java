package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {

		// i want to launch the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		
		String titleFromBRD = "Facebook – log in or sign up";
		String fbtitla = driver.getTitle();

		if(titleFromBRD.equals( fbtitla ))
		{
			System.out.println("test cases pass , title are same");
			System.out.println("expected title is  " +titleFromBRD+" || but found  "+fbtitla);
		}
		else 
		{
			System.out.println("test case failed , title are not same");
			System.out.println("expected title is  " +titleFromBRD+" || but found  "+fbtitla);
		}
		
		
		
		
		
	}
}
