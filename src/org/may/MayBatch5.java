package org.may;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MayBatch5 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		List<WebElement> alltable = driver.findElements(By.tagName("table"));
		     WebElement table = alltable.get(0);
		
		List<WebElement> th= table.findElements(By.tagName("th"));
        		for (WebElement x : th) {
					String s1 = x.getText();
				System.out.println(s1);
        		}
        		WebElement tbody = table.findElement(By.tagName("tbody"));
        		List<WebElement> allrows= tbody.findElements(By.tagName("tr"));
        		int size = allrows.size();
        		System.out.println(size);
        		for (int i = 0; i < size; i++) {
			
        		WebElement rows = allrows.get(i);
        	
				List<WebElement> columns =rows.findElements(By.tagName("td"));
		
					
				
				WebElement column2 = columns.get(2);
				String s2 = column2.getText();
                System.out.println(s2);	
                    
                    
                    
        		} }
	    
}               
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                   // if (s3.equals("iron")) {
					//	WebElement w5 = colums.get(3).findElement(By.tagName("input"));
				//	w5.click();	
				//	}
        		
	
     
        		
        		
		//for (WebElement x2 : w2) {
	//		String s2 = x2.getText();
      //     System.out.println(s2);		
		//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//for (int k = 0; k < we.size(); k++) {
			//int count=0;
			//if (count==0) {
			//WebElement w1 = we.get(k);	
			//}
			
			
		
	    /*List<WebElement> tr = wb.findElements(By.tagName("tr"));
	    for (int i = 0; i < tr.size(); i++) {
	    	WebElement w2 = tr.get(i);
	    
	    List<WebElement> td = wb.findElements(By.tagName("td"));
	    for (int j = 0; j < td.size();j++) {
	    
	    	WebElement get2 = td.get(j);
	    	String text = get2.getText();
	    	//if (text.equals("ICICI pur life")) {
				
			
	    //	System.out.println(text);
	    	//}
			
		}}}*/
		
	