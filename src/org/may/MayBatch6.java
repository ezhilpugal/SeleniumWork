package org.may;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MayBatch6 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
			driver.navigate().to("https://www.flipkart.com/");
		 
		 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement w1 = driver.findElement(By.name("q"));
				w1.sendKeys("redmi note 10");
          WebElement w2 = driver.findElement(By.xpath("//*[@type='submit']"));
              w2.click();
              Thread.sleep(5000);
              WebElement w3 = driver.findElement(By.xpath("(//*[@class='_4rR01T'])[1]"));
              w3.click();
              String parent = driver.getWindowHandle();
              Set<String> allchild = driver.getWindowHandles();
              List<String> l=new ArrayList<String>(allchild);
              // driver.switchTo().window(l.get(1));
          
				
                  driver.switchTo().window(l.get(0));
                 WebElement w5 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));
                  w5.click();
                  Set<String> allchilds = driver.getWindowHandles();
               
						driver.switchTo().defaultContent();
  Actions a = new Actions
	}}


	/*public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//*[text()='Locate us']")).click();
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window ID:" + parentWindowId);
		
		Set<String> allWindowId = driver.getWindowHandles();
		for (String x : allWindowId) {
		if (!parentWindowId.equals(x)) {
		System.out.println("Child Window ID:" + x);
		driver.switchTo().window(x);
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a"))
		.click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		}
		}
		Thread.sleep(3000);
		driver.quit(); }
		}
		*/

	/*public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
			driver.navigate().to("https://www.flipkart.com/");
		 
		 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement w1 = driver.findElement(By.name("q"));
				w1.sendKeys("redmi note 10");
          WebElement w2 = driver.findElement(By.xpath("//*[@type='submit']"));
              w2.click();
              Thread.sleep(5000);
              WebElement w3 = driver.findElement(By.xpath("(//*[@class='_4rR01T'])[1]"));
              w3.click();
              String parent = driver.getWindowHandle();
              Set<String> allchild = driver.getWindowHandles();
              List<String> l=new ArrayList<String>(allchild);
              // driver.switchTo().window(l.get(1));
          
				
                  driver.switchTo().window(l.get(0));
                 WebElement w5 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));
                  w5.click();
                  Set<String> allchilds = driver.getWindowHandles();
               
						driver.switchTo().defaultContent();

	}}

              
              */
              
              
              
              
              
              
              
              
              
              
              
              

