package org.may;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MayBatch9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();
        driver.navigate().back();
        String windowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        WebElement findElement = driver.findElement(By.id(""));
               Dimension l = findElement.getSize();
               
        List<WebElement> findElements = driver.findElements(By.tagName(""));
        WebDriver defaultContent = driver.switchTo().defaultContent();
        WebDriver parentFrame = driver.switchTo().parentFrame();
        Alert alert = driver.switchTo().alert();
        driver.switchTo().frame(1);
        //driver.switchTo().window(arg0)
        Point point = driver.manage().window().getPosition();
        System.out.println(point);
        Dimension size = driver.manage().window().getSize();
        Actions a = new Actions (driver);
        
        a.perform(); 
        
	}

}
