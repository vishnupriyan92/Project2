package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Moveover {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishn\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	WebElement btnLogin = driver.findElement(By.xpath("//span[text()='background-image:url(https://i1.sdlcdn.com/img/leftnavicon09/30x30mobile2.png);']"));
	Actions acc = new Actions(driver);
	acc.moveToElement(btnLogin).perform();
	
}
}
