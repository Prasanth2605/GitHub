package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MechtoolzBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		

		

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (104)version\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://appin.mechtoolz.com/login");
		
		driver.findElement(By.id("email")).sendKeys("prasanth26y@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Prasanth94");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div/div[2]/button")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("dd-user-menu")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Logout")).click();
		
		
		
		


	}

}
