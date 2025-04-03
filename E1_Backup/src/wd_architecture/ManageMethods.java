package wd_architecture;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		Options opt = driver.manage();
		Window win = opt.window();

//		win.minimize();
//		Thread.sleep(1000);
//		win.fullscreen();
//		Thread.sleep(1000);

//		win.maximize();
//		win.minimize();
//		win.fullscreen();

		Dimension dim = win.getSize();
		System.out.println(dim);
		System.out.println(dim.getWidth());
		System.out.println(dim.getHeight());

		Dimension dim2 = new Dimension(691, 368);
		win.setSize(dim2);

		Point pt = win.getPosition();
		System.out.println(pt);
		
		Point sanu = new Point(0, 0);
		win.setPosition(sanu);

		Thread.sleep(3000);
		driver.close();
	}
}
