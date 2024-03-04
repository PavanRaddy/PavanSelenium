package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Lactors1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reddy\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("ABC");
		driver.findElement(By.name("inputPassword")).sendKeys("123");
		driver.findElement(By.className("signInBtn")).click();
		//driver.findElement(By.cssSelector("p.error"));
		driver.findElement(By.linkText("Forgot your password?")).click();
//		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("pavan");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ABc@gmail.com");
		Thread.sleep(10000);
		//driver.findElement(By.cssSelector("input[placeholder='Phone Number'")).sendKeys("12345");//by attributes 
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123"); //by parent to child by giving tag 
		driver.findElement(By.xpath("//button[class='reset-pwd-btn']")).click();


	}

}
