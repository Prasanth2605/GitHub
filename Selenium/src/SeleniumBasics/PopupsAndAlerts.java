package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsAndAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=null;
		

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (104)version\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		if(driver.getPageSource().contains("You successfully clicked an alert")) {
			System.out.println("You successfully clicked an alert");
			System.out.println("=================================");
		}
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		if(driver.getPageSource().contains("You clicked: Cancel")) {
			System.out.println("You clicked: Cancel");
			System.out.println("=====================");
			
		}
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("Prasanth");
		alert2.accept();
		if(driver.getPageSource().contains("You entered: Prasanth")) {
			System.out.println("You entered: Prasanth");
			
			
		}
		
		

	}

}
