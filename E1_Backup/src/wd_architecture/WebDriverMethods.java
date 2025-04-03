package wd_architecture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();

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
