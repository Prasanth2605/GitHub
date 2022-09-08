package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingClickAndHold {
	public static void main(String[] args) throws InterruptedException {
                 WebDriver driver=null;
		

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (104)version\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
//		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
//		
//		
//		WebElement keyA=driver.findElement(By.xpath("//li[text()='A']"));
//		WebElement keyD=driver.findElement(By.xpath("//li[text()='D']"));
//		
//		Actions actions=new Actions(driver);
////		actions.moveToElement(keyA);
////		actions.clickAndHold();
////		actions.moveToElement(keyD);
//	//actions.contextClick(keyD);
//	actions.doubleClick(keyA);
//		actions.release().build().perform();
//		
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drag, drop);
		actions.build().perform();
		
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
	}

}
