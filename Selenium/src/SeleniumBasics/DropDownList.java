package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=null;
		

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (104)version\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://trytestingthis.netlify.app/");
		
		WebElement element=driver.findElement(By.id("option"));
		
		Select select=new Select(element);
		
		List<WebElement> selectalloptions=select.getOptions();
		
		for(WebElement option : selectalloptions) {
			System.out.println(option.getText());
			
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
