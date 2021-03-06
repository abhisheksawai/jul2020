package seleniumBasics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("http://demo.guru99.com/test/guru99home/");
		System.out.println("title of current url is "+driver.getTitle());
		
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();  // another window opened
		
		Set <String> setwind = driver.getWindowHandles();
		Iterator<String> win = setwind.iterator();
		String parentwin = win.next();
		String childwin = win.next();
		//String superchild = win.next();
		
		System.out.println("parent win "+parentwin);
		System.out.println("child win "+childwin);
		
		driver.switchTo().window(childwin);  // goin gto child and taking title
		System.out.println("title of second url is "+driver.getTitle());
		//someclick
		
		driver.switchTo().defaultContent();
		System.out.println("title of defaultContent url is "+driver.getTitle());
		
		driver.switchTo().window(parentwin);
		System.out.println("title of parentwin url is "+driver.getTitle());
		
		
		
		
	}
}