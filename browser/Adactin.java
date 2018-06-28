package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Adactin {
	public static void main(String[] args) {
		//set the driver
		System.setProperty("webdriver.ie.driver", "C:\\Users\\vishn\\eclipse-workspace\\Selenium\\driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		// URl
		driver.get("http://www.adactin.com/HotelApp/");
		
		driver.manage().window().maximize();
		
		//find the username
		WebElement txtUserName=driver.findElement(By.id("username"));
		//insert
txtUserName.sendKeys("Leela");
//find the password
		WebElement txtPassWord=driver.findElement(By.id("password"));
		//insert
txtUserName.sendKeys("Leela");
		
				//quit
		driver.quit();

	}

}
