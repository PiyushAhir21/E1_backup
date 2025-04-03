package E2_backup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		/*
		 * By.id("email") => Locator or Object of By type By emailLoc = By.id("email");
		 * 
		 */

//		Direct Locators
		/*
		id
		name
		linkText
		partialLinkText
		className
		tagName
		*/

		
		// id
		WebElement email = driver.findElement(By.id("email"));

//		name
		WebElement pass = driver.findElement(By.name("pass"));

//		linkText
//		<a> link text </a>
//		WebElement forgot = driver.findElement(By.linkText("Forgotten password"));
//		WebElement forgot = driver.findElement(By.partialLinkText("Forgotten"));
//		forgot.click();

//		className => least recommended
//		InvalidSelectorException
//		driver.findElement(By.className("selected ")).click();

//		tagName => Not recommended
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		

//		expressions
//		cssSelector()
//		syntax of cssSelector => tagName[attributeName = 'attributeValue']
		
	}
}
