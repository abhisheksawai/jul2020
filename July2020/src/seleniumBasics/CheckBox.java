package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// finding total checkbox on wenapge
		List <WebElement> countCheck = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("total checkbx count is "+countCheck.size());
		
		// webelement remember done here
		WebElement remember = driver.findElement(By.xpath("//input[@id='remember']"));
		remember.click();
		
		//Thread.sleep(5000);
		
		// printing whether it is selected or not
		System.out.println("check if checkbox is selected --> "+remember.isSelected());
		
//		first check it is selected or not
//		if not selected then select it and the proceed to next step
//		if already selected then proceed to next step


		if(!remember.isSelected())
		{
			System.out.println("remember is not selected then this ");
			remember.click();
		}
		
		
		if(remember.isSelected())
		{
			System.out.println("Yes remember check box  is selected hence pass the test case");
		}
		
		else
		{
			
			System.out.println("remember is not selected hence failed the test case ");
			System.out.println("i have clicked the checkbox remeber and now next step");
			remember.click();
			
		}
		
		System.out.println("rest of the code");
		
		
	}

}
