package mouse.action.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_N_Drop {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/nazrulislam/Downloads/geckodriver");
		dragAndDrop();
		
	}
	
	public static void dragAndDrop() throws InterruptedException {
		//This method firstly performs a click-and-hold on the source element, 
		//moves to the location of the target element and then releases the mouse.					
         driver= new FirefoxDriver();					
         driver.get("http://demo.guru99.com/test/drag_drop.html");	
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         
		//Element which needs to drag.    		
        	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
        	WebElement From1=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a"));
         
         //Element on which need to drop.		
         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));	
         WebElement To1=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));		
         		
        Actions ac=new Actions(driver);				

	//Dragged and dropped.		
         ac.dragAndDrop(From, To).build().perform();
         Thread.sleep(2000);
         ac.dragAndDrop(From1, To1).build().perform();
         Thread.sleep(2000);
	}	

}
