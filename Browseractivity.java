package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browseractivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	     driver.navigate().to("https://www.google.com/");
	     driver.navigate().back();
	     driver.navigate().forward();
	     driver.manage().window().maximize();
	     driver.close();
	}

}
