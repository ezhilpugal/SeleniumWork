package org.may;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MayBatch7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to("https://www.google.co.in/");
		driver.navigate().to("http://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		List<WebElement> w1 = driver.findElements(By.tagName("iframe"));
		
		driver.switchTo().frame(1);
		
		 driver.findElement(By.xpath("//*[@src='Jmeter720.png']")).click();
		 String parent = driver.getWindowHandle();
         Set<String> allchild = driver.getWindowHandles();
         List<String> l=new ArrayList<String>(allchild);
         // driverver.switchTo().window(l.get(1));
     
			
             driver.switchTo().window(l.get(1));
		 driver.findElement(By.name("email")).sendKeys("ezhil");
		 driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("lokesh");

}
}