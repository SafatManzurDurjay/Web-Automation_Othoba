package Othoba_Automation_LOGIN;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Othoba_Automation_LoginTest {
	
	@Test

public void WebAutomation () throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	//create a chromeDriver object named driver.
	WebDriver driver = new ChromeDriver();
	
	//go to google web page
	driver.get("https://www.othoba.com/");
	//Maximize the browser window
	
	driver.manage().window().maximize();
	
	Actions action = new Actions(driver);
	
	WebElement mainMenuElement = driver.findElement(By.xpath("//span[normalize-space()='Login']"));
	action.clickAndHold(mainMenuElement).build().perform();
	Thread.sleep(3000);
	
	WebElement submenuElement = driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/div[5]/div[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/img[1]"));
	System.out.println(submenuElement.getText());
	submenuElement.click();
	Thread.sleep(3000);
	
	WebElement inputTextElement = driver.findElement(By.xpath("//input[@id='PhoneOrEmail_Popup']"));
	inputTextElement.sendKeys("01790891807");
	Thread.sleep(3000);
	
	inputTextElement = driver.findElement(By.xpath("//input[@id='Password_Popup']"));
	inputTextElement.sendKeys("1234114476");
	Thread.sleep(3000);
	
	inputTextElement = driver.findElement(By.xpath("//input[@value='LOGIN']"));
	inputTextElement.click();
	Thread.sleep(3000);
	
	
	driver.quit();			
		
	}
	
}
