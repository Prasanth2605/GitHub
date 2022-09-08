package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptions {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=null;
		

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (104)version\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://trytestingthis.netlify.app/");
		
		WebElement element=driver.findElement(By.id("option"));
		
		Select options=new Select(element);
		
		options.selectByIndex(1);
		Thread.sleep(3000);
		options.selectByValue("option 2");
		Thread.sleep(3000);
		options.selectByVisibleText("Option 3");
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
