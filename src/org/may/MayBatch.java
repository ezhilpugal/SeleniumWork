package org.may;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MayBatch {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		
		web.navigate().to("https://en-gb.facebook.com/");
		web.manage().window().maximize();
		WebElement w1 = web.findElement(By.id("email"));
		WebElement w2 = web.findElement(By.id("pass"));
		WebElement w3 = web.findElement(By.xpath("//*[@type='submit']"));
		//WebElement w4 = web.findElement(By.xpath("//*[@alt='Facebook']"));
		
		JavascriptExecutor j = (JavascriptExecutor)web;
		j.executeScript("arguments[1].setAttribute('value','ezhil')", w1);
		j.executeScript("arguments[0].setAttribute('value','123456')", w2);
		Object o3 = j.executeScript("return arguments[0].getAttribute('value')",w1);
		//j.executeScript("return arguments[0].getAttribute()'value')",w4);
		System.out.println(o3);
		//j.executeScript("arguments[0].click()",w3);
		TakesScreenshot tt = (TakesScreenshot)web;
		File sur = tt.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\screen");
		FileUtils.copyFile(sur,f);
		
		
		
		
		
	}

}
