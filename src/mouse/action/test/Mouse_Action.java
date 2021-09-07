package mouse.action.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {
	WebDriver driver;
	Actions ac;

	public Mouse_Action(WebDriver driver) {
		this.driver = driver;
		ac = new Actions(driver);

	}

	public void clickAndHold() {
		// Actions ac=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/a/img"));
		ac.clickAndHold(ele).build().perform();

	}

	public void moveToElement() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[2]/nav/ol/li[1]/a"));
		ac.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[2]/nav/ol/li[1]/div/ol/li[1]/ol/li[1]/a")).click();
	}

	public void doubleClick() throws InterruptedException {
		WebElement ele = driver.findElement(By.cssSelector(".DesktopHeader_icons__25y0X > div:nth-child(3) > div:nth-child(1) > button:nth-child(2) > svg"));
		ac.doubleClick(ele).build().perform();
		Thread.sleep(3000);

	}

	public void rightClick() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/a/img"));
		ac.contextClick(ele).build().perform();
		Thread.sleep(2000);
		
	}
	
	public void release() {
		WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/a/img"));
		ac.release().build().perform();
		
	}


}
