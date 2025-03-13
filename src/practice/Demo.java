package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo {

	public WebDriver driver;
	
	public void openurl() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
	}
	public void Register() {
		// name
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Swamy");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Kumar");
		//Address
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("dthtgv");
		//Email
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("swamy@gmail.com");
		//Phone
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9999088880");
		//Gender
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		//Hobbies
		driver.findElement(By.id("checkbox1")).click();
		
		driver.findElement(By.id("checkbox3")).click();
		//Languages
		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[6]")).click();
		//Skills
		new Select(driver.findElement(By.id("Skills"))).selectByVisibleText("APIs");
		//Country
		new Select(driver.findElement(By.id("countries"))).selectByVisibleText("Select Country");
		//Select country
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[6]")).click();
		new Select(driver.findElement(By.id("yearbox"))).selectByVisibleText("1919");
		new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"))).selectByVisibleText("June");
		new Select(driver.findElement(By.id("daybox"))).selectByVisibleText("16");
		// Pasword
		driver.findElement(By.id("firstpassword")).sendKeys("990880");
	}

	public static void main(String[] args) throws Exception {
		Demo d = new Demo();
		d.openurl();
		d.Register();
		// TODO Auto-generated method stub
	}
}
