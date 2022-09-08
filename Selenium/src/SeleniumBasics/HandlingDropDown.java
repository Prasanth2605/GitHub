package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver 104\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.get("https://appin.mechtoolz.com/login");
		
		driver.findElement(By.id("email")).sendKeys("prasanth26y@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Prasanth1994");
		
		driver.findElement(By.className("btn-rounded"));
		
		driver.findElement(By.className("lbl")).click();
		
		
		
		
		
		WebElement selectbranch=driver.findElement(By.className("form-control"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("Year"));
		
		selectvaluefromdropdown(selectbranch,"10");
		selectvaluefromdropdown(month,"6");
		selectvaluefromdropdown(year,"1990");
		
		driver.quit();
	}
		
		
		public static void selectvaluefromdropdown(WebElement element,String value) {
			Select select=new Select(element);
			select.selectByVisibleText(value);
			
			
		}
		
		
		

	}


