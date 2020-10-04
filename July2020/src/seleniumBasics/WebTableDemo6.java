package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo6 {
	
	
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
			// can print all companyname here
			// System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]")).getText());
			String travelCompany = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]")).getText();
			
			if(companytoSearch.equals(travelCompany))
			{
				System.out.println("travel company is "+travelCompany);
				System.out.println("and row number is "+i);
				System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]")).getText());
				System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[2]")).getText());
				System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[3]")).getText());
				System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[4]")).getText());
				
				
				//here find row value
//				for(int j = 1 ; j  <=  cols.size() ; j ++)
//				{
//					// can print all companyname here
//					System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
//				
//				/// break;
//			}
				break;
		}

}
}}