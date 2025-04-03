package wd_architecture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		/*
		 * webdriver is type
		 * driver is reference variable
		 * new is a keyword which will create random memory space
		 * in heap area
		 * cd() is constructor call which does 3 job
		 * 1. Start the server
		 * 2. Launch the empty chrome browser
		 * 3. Register , load and re-initialize the nonstatic members
		 * in heap area
		 */
//		driver = new EdgeDriver();
//		driver = new FirefoxDriver();
		
		driver.get("https://www.instagram.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Thread.sleep(2000);
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		driver.findElement(By.xpath("//span[text()='Meta']")).click();
		
		Thread.sleep(3000);
//		driver.close();
		driver.quit();
		
		
		
		
	}
}
