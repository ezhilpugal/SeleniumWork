package org.may;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MayBatch4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.navigate().to("https://www.google.co.in/");
		//dri.navigate().to("http://demo.automationtesting.in/Register.html");
		dri.manage().window().maximize();
				WebElement w1 = dri.findElement(By.xpath("//*[@name='q']"));
				w1.sendKeys("selenium");
				Thread.sleep(5000);
				List<WebElement> w2 = dri.findElements(By.xpath("(//span[contains(text(),'selenium')])"));
                   int i1 = w2.size();
                   
					System.out.println(i1);
					for (int i = 0; i < i1; i++) {
						WebElement get = w2.get(i);
						String s1 = get.getText();
						System.out.println(s1);
					}
					w2.get(i1-1).click();
		/*List<WebElement> w1 = dri.findElements(By.tagName("a"));
				int i1 = w1.size();
				System.out.println(i1);
				for (WebElement x1 : w1) {
					System.out.println(x1.getText());
					}*/
	//Thread.sleep(5000);
		/*List<WebElement> w1 = dri.findElements(By.xpath("//*[@type='checkbox']"));
		for (WebElement x1 : w1) {
			
		
		
			String s1 = x1.getAttribute("value");
			
			if (s1.equals("Cricket")||s1.equals("Hockey")) {
		x1.click();
			}	*/
			/*if (!x1.isSelected()) {
			x1.click();
			}*/
				
			
		//dri.findElement(By.xpath("(//*[@class='col-md-4 col-xs-4 col-sm-4'])[6]")).click();
		//System.out.println(text);
		
}}
		