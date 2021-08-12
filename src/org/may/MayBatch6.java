package org.may;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MayBatch6 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.findElement(By.xpath(".//*[@id='cee_closeBtn']/img")).click();
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window ID:" + parentWindowId);
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		//List<String> l=new ArrayList<String>(allWindowId);
		//By passing index we can switch the desired window
		driver.switchTo().window(l.get(1));

		//dri.navigate().to("https://www.google.co.in/");
		/*dri.navigate().to("https://www.flipkart.com/");
		 
		 
		dri.manage().window().maximize();
		dri.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement w1 = dri.findElement(By.name("q"));
				w1.sendKeys("oneplus mobiles");
          WebElement w2 = dri.findElement(By.xpath("//*[@type='submit']"));
              w2.click();
              Thread.sleep(5000);
              WebElement w3 = dri.findElement(By.xpath("//*[@class='_4rR01T']"));
              w3.click();
              String parent = dri.getWindowHandle();
              Set<String> allchild = dri.getWindowHandles();
              List<String> l=new ArrayList<String>(allchild);
              for (String x : allchild) {
            	  if (!parent.equals(x)) {
            		dri.switchTo().window(x);
            		  
            		  
            	  }}
				 WebElement w4 = dri.findElement(By.xpath("//*[@class='B_NuCI']"));
                  String text = w4.getText();
                  System.out.println(text);
                  Thread.sleep(10000);
                  dri.switchTo().defaultContent();
                 	*/
	
	
	}}

              
              
              
              
              
              
              
              
              
              
              
              
              
              

