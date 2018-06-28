package browser;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vishn\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		driver.manage().window().maximize();
		WebElement btnLogin = driver.findElement(By.xpath("//a[@class='link6']"));
		btnLogin.click(); // opens in new window
		//switch driver into new window
		/*String Pwindow = driver.getWindowHandle();
		Set<String> aWindow= driver.getWindowHandles();
		for (String x : aWindow)
		{
			if(!Pwindow.equals(x)) {
				driver.switchTo().window(x);
			}
			
		}*/
}
}
