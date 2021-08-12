package org.may;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MayBatch7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		//dri.navigate().to("https://www.google.co.in/");
		dri.navigate().to("http://demo.guru99.com/test/guru99home/");
		dri.manage().window().maximize();
		
		
		List<WebElement> w1 = dri.findElements(By.tagName("iframe"));
		//int size = w1.size();
		//System.out.println(size);
		dri.switchTo().frame("a077aa5e");
		 dri.findElement(By.xpath("//*[@src='Jmeter720.png']")).click();
		 dri.switchTo().defaultContent();
		

}
}