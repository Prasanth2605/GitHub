package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver=null;
		

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (104)version\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		
//		driver.findElement(By.name("q")).sendKeys("prasanth"+Keys.ENTER);
//		
//		Actions actions=new Actions(driver);
//		Action keydown=actions.keyDown(Keys.CONTROL).sendKeys("a").build();
//		keydown.perform();
		
		Actions action=new Actions(driver);
		WebElement keyup=driver.findElement(By.name("q"));
		
		action.keyDown(Keys.SHIFT).sendKeys(keyup,"prasanth").keyUp(Keys.SHIFT).sendKeys("selenium").perform();
		Thread.sleep(3000);
		keyup.clear();
		driver.close();
		
		
		

	}

}
