package test;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium web driver\\chromedriver.exe");
		
		
		
				WebDriver driver = new ChromeDriver();
				Thread.sleep(2000);
				
				driver.manage().window().maximize();
				
				driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
			String  t=	driver.getTitle();
			System.out.println(t);
			
			WebElement x= driver.findElement(By.xpath("//button[@data-target=\"developers-dd-menu\"]"));
			
			Actions a = new Actions(driver);
			
			a.moveToElement(x).perform();
			
			WebElement support = driver.findElement(By.xpath("(//span[text()='Support'])[1]"));
			
			a.click(support).perform();
			
			Robot r = new Robot();
			
		WebElement	txt = driver.findElement(By.xpath("(//input[@placeholder='Search across BrowserStack ...'])[1]"));
		
		                   txt.sendKeys("vicky");
			
		                   r.keyPress(KeyEvent.VK_CONTROL);
		                  
		
				
				
				}

	}


