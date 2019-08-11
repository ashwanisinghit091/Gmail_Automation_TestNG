package Gmail;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Gmail_Login2 extends Base{

	
	@Test
	public static void Gmaill2() throws IOException, AWTException, InterruptedException{
		
		
		Driver.findElement(By.xpath("//div[@class='z0']/div")).click();

		Driver.findElement(By.name("to")).sendKeys("");//put receiver mail id
		Driver.findElement(By.xpath("//input[@class='aoT']")).sendKeys("Automated Mail");
		
		Hold.waitt(Driver, By.xpath("//tr[@class='btC']"));
		WebElement emoji=Driver.findElement(By.xpath("//tr[@class='btC']"));
		Hold.waitt(Driver, By.xpath("//div[@class='bAK']/div"));
		int size=emoji.findElements(By.xpath("//div[@class='bAK']/div")).size();
		for(int i=0;i<size;i++) {
		String text=emoji.findElements(By.xpath("//div[@class='bAK']/div")).get(i).getAttribute("command");
		if(text.equalsIgnoreCase("+link")) {
			
			emoji.findElements(By.xpath("//div[@class='bAK']/div")).get(i).click();
			
	}
	
	}
	WebElement we1=	Driver.findElement(By.xpath("//div[@class='Kj-JD LW-JD']"))	;
	we1.findElement(By.xpath("//input[@id='linkdialog-text']")).sendKeys("Happy Bday");
	
	we1.findElement(By.xpath("//input[@id='linkdialog-onweb-tab-input']")).sendKeys("www.fb.com");
	we1.findElement(By.xpath("//button[@name='ok']")).click();
	
	emoji.findElement(By.xpath("//div[@class='dC']/div[@role='button'][1]")).click();
	
	int size1=Driver.findElements(By.xpath("//div[@class='aio UKr6le']")).size();
	

	for(int k=0;k<size1;k++) {
	String Option=	Driver.findElements(By.xpath("//div[@class='aio UKr6le']/span/a")).get(k).getAttribute("title");
		
	if(Option.equalsIgnoreCase("Sent")) {
	Driver.findElements(By.xpath("//div[@class='aio UKr6le']/span")).get(k).click();
		}}

	Hold.waitt(Driver, By.xpath("//div[2]/div/div[@class='Cp']/div/table/tbody"));
		WebElement we23=Driver.findElement(By.xpath("//div[2]/div/div[@class='Cp']/div/table/tbody"));
		for(int l=0;l<we23.findElements(By.xpath("tr[@jsmodel='nXDxbd']/td[6]/div/div/div/span/span")).size();l++) {
		String Subject=we23.findElements(By.xpath("tr[@jsmodel='nXDxbd']/td[6]/div/div/div/span/span")).get(l).getText();
		
		if(Subject.equalsIgnoreCase("Automated Mail")) {
			we23.findElements(By.xpath("tr[@jsmodel='nXDxbd']/td[6]/div/div/div/span/span")).get(l).click();	
		}
		}
	
	}
}
