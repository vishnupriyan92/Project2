package browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vishn\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		driver.manage().window().maximize();
		WebElement btnLogin = driver.findElement(By.xpath("//a[@href='javascript:forgetPassword();']"));
		btnLogin.click(); // opens in new window
		//switch driver into new window
		String Pwindow = driver.getWindowHandle();
		Set<String> aWindow= driver.getWindowHandles();
		for (String x : aWindow)
		{
			if(!Pwindow.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		//switched
		WebElement txtUserName = driver.findElement(By.xpath("//a[text()='netsupport@lvbank.in']"));
		txtUserName.click();
		//driver.quit();*/
		
		
		String Pwindow1 = driver.getWindowHandle();
		Set<String> aWindow1= driver.getWindowHandles();
		for (String x : aWindow)
		{
			if(Pwindow.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		WebElement btnLogin1 = driver.findElement(By.xpath("//a[@href='javascript:forgetPassword();']"));
		btnLogin1.click(); 
}
	}
