package Gmail;

import org.testng.annotations.Test;
import java.awt.AWTException;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Gmail_Login5 extends Base{

	
	
	
	@Test
	public static void Gmaill5() throws IOException, AWTException, InterruptedException {
		
		
		
		Driver.findElement(By.xpath("//span[@class='gb_Ba gbii']")).click();
		
		WebElement we=Driver.findElement(By.xpath("//div[@class='gb_Ca gbip']"));
		we.findElement(By.xpath("//div[@class='gb_Ca gbip']")).click();
		Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@allow='camera']")));
		//System.out.println(Driver.findElements(By.tagName("iframe")).size());
		Driver.findElement(By.className("kf-kq-Dq")).click();
		
		
		Upload.uploadFileWithRobot("D:\\ash.png");
		//WebElement we3=Driver.findElement(By.xpath("//div[@class='kf-Mk-eb.kf-Nn-eb']"));
		Thread.sleep(5000);
		Driver.findElement(By.xpath("//div[@id='editbar-rotate-left']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//div[@id='editbar-rotate-left']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//div[@id='editbar-rotate-left']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//div[@id='editbar-rotate-left']")).click();
		Driver.findElement(By.xpath("//div[@id='picker:ap:3']")).click();
	}
}
