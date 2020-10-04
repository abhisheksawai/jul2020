package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		WebElement username = Driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7678616230");
	//one wauy	driver.findElement(By.xpath("expression")).sendKeys("mobilenumer");
		WebElement somename = driver.findElement(By.xpath("expowe"));
		somename.sendKeys("898789789");
		
		Select daydropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		
		System.out.println("first selected "+daydropdown.getFirstSelectedOption().getText());
		List <WebElement> daycount = daydropdown.getOptions();
		System.out.println(daycount.size());
		
		for(WebElement w : daycount)
		{
			System.out.println(w.getText());
		}
		
		
		
		//WebElement daydrop = driver.findElement(By.xpath("//select[@id='day']"));
		//Select ddDay = new Select(daydrop);
		
	//	daydropdown.selectByIndex(0);
		daydropdown.selectByVisibleText("21");
	//	daydropdown.selectByValue(arg0);
		
		Select Monthdropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		Monthdropdown.selectByValue("3");
	}

}
