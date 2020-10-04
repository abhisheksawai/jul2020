package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		List<WebElement> radiocount = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radiocount.size());
		
		//WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
		WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
		System.out.println("enabled or not-> "+female.isEnabled());  //ok
		System.out.println("selected or not-> "+female.isSelected());  //ok
		
		female.click(); //after click successfully clicked on female
		
		System.out.println("after click enabled or not-> "+female.isEnabled());  //ok
		System.out.println("after click selected or not-> "+female.isSelected());  //ok
		System.out.println("after click on female");
		
		if(female.isSelected())
		{
			System.out.println("Yes female is selected hence pass the test case");
		}
		
		else
		{
			System.out.println("female is not selected hence failed the test case ");
		}
		
		
		
	}

}
