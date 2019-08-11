package Gmail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Gmail_Login1 extends Base{

	
	
	
	@Test(dataProvider= "getData")
	public static void Gmaill1(String username,String subject) throws IOException, AWTException, InterruptedException {

		
		Driver.findElement(By.xpath("//div[@class='z0']/div")).click();
		Thread.sleep(4000);
		Driver.findElement(By.name("to")).sendKeys(username);
		Driver.findElement(By.xpath("//input[@class='aoT']")).sendKeys(subject);
		Hold.waitt(Driver, By.xpath("//tr[@class='btC']"));
		
		
		WebElement emoji=Driver.findElement(By.xpath("//tr[@class='btC']"));
		WebElement we2=Driver.findElement(By.className("aZ"));
		if(!we2.isDisplayed()) {emoji.findElement(By.xpath("//td[@class='oc gU']/div")).click();}
	//	Hold.waitt(Driver, By.xpath("//td[@class='oc gU']/div"));
		//emoji.findElement(By.xpath("//td[@class='oc gU']/div")).click();
		
		Hold.waitt(Driver, By.className("aZ"));
		//WebElement we2=Driver.findElement(By.className("aZ"));
		
		//String option34=we2.findElement(By.xpath("//div[@class='J-Z']/div[6]")).getAttribute("command");
		
		
		int size2=we2.findElements(By.xpath("//div[@class='J-Z']/div")).size();
		
		for(int n=5;n<size2;n++) {
			
			String option=we2.findElements(By.xpath("//div[@class='J-Z']/div")).get(n).getAttribute("command");//div[@class='J-M J-M-ayU fx'][2]/div[2]
			
			if(option.equalsIgnoreCase("+fontSize")) {
				
				we2.findElements(By.xpath("//div[@class='J-Z']/div")).get(n).click();
				int size3=we2.findElements(By.xpath("//div[@class='J-M J-M-ayU fx'][2]/div")).size();
				
				
				for(int m=0;m<size3;m++) {
					
				String text=	we2.findElements(By.xpath("//div[@class='J-M J-M-ayU fx'][2]/div")).get(m).getText();//div[@class='J-M J-M-ayU fx'][2]/div/div[1]
			
				if(text.equalsIgnoreCase("Large")) {
					
					we2.findElements(By.xpath("//div[@class='J-M J-M-ayU fx'][2]/div/div")).get(m).click();
				}	
				
			}
			n++;
		}
		
		if(option.equalsIgnoreCase("+bold")) {
			
			
			we2.findElements(By.xpath("//div[@class='J-Z']/div")).get(n).click();
			Thread.sleep(4000);
		}
		
if(option.equalsIgnoreCase("+italic")) {
			
			
			we2.findElements(By.xpath("//div[@class='J-Z']/div")).get(n).click();
			break;
		}
		
		
		
		
	
		
			
		}
		
		
		
		Driver.findElement(By.cssSelector("div[role='textbox']")).sendKeys("Do Not Reply as it is automated generated mail");
		
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
	
	@DataProvider
	public  Object[][] getData(){

	Object[][] o=new Object[3][2];
//put the values
	o[0][0]="";//put receiver mail id
	o[0][1]="automated mail";


	o[1][0]="";//put receiver mail id
	o[1][1]="automated mail";

	o[2][0]="";//put receiver mail id
	o[2][1]="automated mail";

	 return o;
	}
	
	
}





