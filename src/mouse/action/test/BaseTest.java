package mouse.action.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	WebDriver driver;
	public WebDriver openBrowser() {
		System.setProperty("webdriver.gecko.driver", "/Users/nazrulislam/Downloads/geckodriver");
		// System.setProperty("webdriver.chrome.driver", "/Users/nazrulislam/Downloads/chromedriver");
		if(driver==null) {
		driver=new FirefoxDriver();
		driver.get("https://www.express.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/section[2]/button")).click(); 
	}
		return driver;
		}
	
	public void handleDriver() throws InterruptedException {
		driver.quit();
		Thread.sleep(5000);
	}

}
