package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class FaceBook {
public static void main(String[] args) {
	//set the driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishn\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			// URl
			driver.get("http://www.facebook.com");
			
			driver.manage().window().maximize();
			
			//find the firstname
			WebElement txtUserName=driver.findElement(By.name("firstname"));
			//insert firstname
	txtUserName.sendKeys("Leelavathi");
	//find the lastname
			WebElement txtPassWord=driver.findElement(By.name("lastname"));
			//insert lastname
	txtUserName.sendKeys("Dhanabal");
	
	
	//insert emailid
	
	WebElement txtEmailID=driver.findElement(By.name("reg_email__"));
	
	txtEmailID.sendKeys("leeladhanabal@gmail.com");
	
	
	//insert password
	
	WebElement txtPassword=driver.findElement(By.name("reg_passwd__"));
	txtPassword.sendKeys("leela");
	
			
					//quit
			driver.quit();


}
}
