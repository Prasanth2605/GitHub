package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String[] args) {
		
	
	
	WebDriver driver=null;
	

	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (104)version\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://appin.mechtoolz.com/login");
	
	
	driver.findElement(By.id("email")).sendKeys("prasanth26y@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Prasanth94");
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div/div[2]/button")).click();
	
	
	  String i = driver.getCurrentUrl();
	  System.out.println(i);
	  String j = driver.getTitle();
	  System.out.println("Your page title Is : "+j);
	


}
}