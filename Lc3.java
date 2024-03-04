package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Lc3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		String password = getPassword(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(5000);

		driver.findElement(By.className("submit")).click();
		//((WebElement) driver.findElements(By.xpath("//*[text()='Log Out']"))).click();
		Thread.sleep(5000);

		driver.findElement(By.className("logout-btn")).click();
		driver.close();
		//System.out.println(driver.findElement(By.tagName("p")).getText());

		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	}
	public static String  getPassword(WebDriver driver) throws InterruptedException {
		

driver.get("https://rahulshettyacademy.com/locatorspractice/");

driver.findElement(By.linkText("Forgot your password?")).click();

Thread.sleep(1000);

driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

String passwordText =driver.findElement(By.cssSelector("form p")).getText();

//Please use temporary password 'rahulshettyacademy' to Login.

String[] passwordArray = passwordText.split("'");

// String[] passwordArray2 = passwordArray[1].split("'");

// passwordArray2[0]

String password = passwordArray[1].split("'")[0];

return password;

//0th index - Please use temporary password

//1st index - rahulshettyacademy' to Login.



//0th index - rahulshettyacademy

//1st index - to Login.
	}

}
