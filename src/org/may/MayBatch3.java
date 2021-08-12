package org.may;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MayBatch3 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
        web.navigate().to("http://demo.automationtesting.in/Alerts.html");
		web.manage().window().maximize();
		WebElement w1 = web.findElement(By.xpath("//*[@class='btn btn-danger']"));
		w1.click();
		Alert a = web.switchTo().alert();
		 a.accept();
		 
	     
	    web.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
        web.findElement(By.xpath("//*[@class='btn btn-primary']")).click();	
  //  web.findElement(By.xpath("//a[text()='Register']")).click();
         a.dismiss();
         
        web.findElement(By.xpath("(//*[@class='analystic'])[3]")).click();
        WebElement w2 = web.findElement(By.xpath("//*[@class='btn btn-info']"));
		w2.click();
        a.sendKeys("ezhil");
		
        String s = a.getText();
        System.out.println(s);
        a.accept();
        //web.switchTo().alert();
        
      //  Robot r = new Robot

	}}
