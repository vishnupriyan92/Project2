package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoke {
public static void main(String[] args) {
//config the driver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishn\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// URl
	driver.get("http://www.greenstechnologys.com");
	//title
	String title = driver.getTitle();
	System.out.println(title);
	//current url
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	//quit
	driver.quit();
}
}
