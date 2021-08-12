package org.may;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MayBatch2 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		
		web.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		web.manage().window().maximize();
		WebElement ww1 = web.findElement(By.xpath("(//select)[1]"));
		Select s = new Select(ww1);
		boolean m2 = s.isMultiple();
		System.out.println("multiple dropdown"+m2);
		s.selectByIndex(2);
		s.selectByValue("Wednesday");
		s.selectByVisibleText("Thursday");
		 List<WebElement> l1 = s.getOptions();
		for (WebElement x : l1) {
			System.out.println(x.getText());
		}	
		List<WebElement> l4 = s.getAllSelectedOptions();
		 System.out.println("ALL SELECTED OPTIONS");
		 for (WebElement w4 : l4) {
			 System.out.println(w4.getText());
			
		}
	  
	    
	 WebElement ww2 = web.findElement(By.xpath("(//select)[2]"));
			Select s2 = new Select(ww2);
		
			
			 boolean m1 = s2.isMultiple();
			 System.out.println(m1);
			 System.out.println();
			  s2.selectByIndex(2);
			  s2.selectByIndex(3);
			  WebElement w2 = s2.getFirstSelectedOption();
			  System.out.println("Firstselectoptions..............."+w2.getText());
			  System.out.println();
		List<WebElement> l2 = s2.getAllSelectedOptions();
		 System.out.println("ALL SELECTED OPTIONS");
	     for (WebElement x1 : l2) {
	      System.out.println(x1.getText());
			
		}
	     System.out.println();
	     List<WebElement> l3 = s2.getOptions();
	 	System.out.println("ALL OPTIONS FOR MUTIPLE DROPDOWN");
			for (int i = 0; i < l3.size(); i++) {
			WebElement output = l3.get(i);
			String text = output.getText();	
		    System.out.println(text);
		    
			}	
	
		
		
	

	}
}
