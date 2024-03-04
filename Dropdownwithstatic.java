package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdownwithstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with the select there is a spl class called select
		WebElement StaticDropdwon = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(StaticDropdwon);
		dropdown.selectByIndex(2); //selection by index 
	System.out.println(dropdown.getFirstSelectedOption().getText());
	driver.manage().window().maximize();
	dropdown.selectByVisibleText("INR"); //selection by the text 
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("USD"); //by providinhg the "value" of the attribute 
	System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
