package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
	public static  WebDriver startBrowser() {
		
		System.setProperty("webdriver.chrome.driver", ".\\driverNew\\chromedriver.exe");
		 driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://techfios.com/test/101/");
	return driver;	
		

}
	public static void tearDown() throws InterruptedException {
		driver.close();
		driver.quit();
		Thread.sleep(4000);
		
	}

}
