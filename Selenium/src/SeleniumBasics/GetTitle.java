package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {
	
	public static void main(String[]str) {
		try {
			
			System.setProperty("webdriver.edge.driver","E:\\edgeBrowser\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			
			driver.get("https://appin.mechtoolz.com/login");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
		}catch(Exception obj) {
			obj.printStackTrace();
		}
	}

}
