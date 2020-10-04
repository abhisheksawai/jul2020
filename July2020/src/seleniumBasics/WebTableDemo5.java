package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo5 {
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("total row present here as  --> ");
		System.out.println(rows.size());
		int rowCount  = rows.size();
		
		List <WebElement> cols = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
		System.out.println("total col present here as  --> ");
		System.out.println(cols.size());
		
		String companytoSearch = "Lupin Ltd.";
		
		for(int i = 1 ; i < rowCount ; i ++)
		{
			String travelCompany = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]")).getText();

}
}}