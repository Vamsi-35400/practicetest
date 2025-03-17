package practice;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class ToolsQA {
	
	public WebDriver driver;
	
  @Test
  public void register() {
	  driver.findElement(By.id("first-name")).sendKeys("Swamy"); //FirstName
	  driver.findElement(By.id("last-name")).sendKeys("Kumar"); // LastName
	  driver.findElement(By.id("email")).sendKeys("skumar@gmail.com"); //Email
	  driver.findElement(By.id("mobile")).sendKeys("9999088880"); //MobileNumber
	  new Select(driver.findElement(By.id("country"))).selectByVisibleText("India"); //Country
	  driver.findElement(By.id("city")).sendKeys("Rajahmundry"); //City
	  driver.findElement(By.id("message")).sendKeys("Well written code"); //Message box
	  driver.switchTo().activeElement().sendKeys(Keys.TAB); //move to next field
	  driver.switchTo().activeElement().sendKeys(Keys.TAB); //move to next field
	  driver.switchTo().activeElement().sendKeys(Keys.ENTER); //click
  }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
  }

  @AfterTest
  public void afterTest() {
  }

}

