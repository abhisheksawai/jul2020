package seleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		
		//TakesScreenshot screen = (TakesScreenshot) driver;
		//File src = screen.getScreenshotAs(Output.file);
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\lenovo\\Desktop\\Current Batch\\julsnap.png"));
		
		
		
		
}}