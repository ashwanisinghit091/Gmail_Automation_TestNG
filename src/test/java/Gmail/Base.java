package Gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


public class Base {

	
	
	
	
	static WebDriver Driver;
	@BeforeMethod
	public static void invoke_browser() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	 Driver =new ChromeDriver();
		
		Driver.get("https://www.gmail.com");
		Driver.manage().window().maximize();

		Driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		Driver.findElement(By.id("identifierId")).sendKeys("");//put username for login
		
		Driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		Driver.findElement(By.name("password")).sendKeys("");//put password for login
		Driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
	}
	
	@AfterMethod
	public static void j() throws InterruptedException {

		Driver.close();
	
	
	}
	
}
