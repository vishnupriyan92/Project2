package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishn\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.switchTo().frame("login_page");
	WebElement btnlogin = driver.findElement(By.name("fldLoginUserId"));
	btnlogin.sendKeys("54351654");
	WebElement btnlogin1 = driver.findElement(By.xpath("//@img[src='/gif/continue_new1.gif?v=1']"));
	btnlogin1.click();
	//driver.quit();
}
}
