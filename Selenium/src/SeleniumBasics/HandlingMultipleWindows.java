package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=null;
	System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver 104\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://www.naukri.com/");
	
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[2]/div/div[1]/div/div/div/div[3]/a")).click();
	
	Set<String> windowhandle=driver.getWindowHandles();
	
	Iterator<String>iterator=windowhandle.iterator();
	
	String parentwindow=iterator.next();
	String childwindow=iterator.next();
	
	driver.switchTo().window(childwindow);
	
	driver.findElement(By.id("name")).sendKeys("prasanth");
	Thread.sleep(3000);
	
	driver.switchTo().window(parentwindow);
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	
	driver.close();
	
	
	}
}
