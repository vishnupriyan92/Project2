package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\vishn\\eclipse-workspace\\Selenium\\lib\\chromedriver_win32.zip");
    WebDriver driver = new ChromeDriver();
	driver.get("http://www/greenstechnologys.com");
	WebElement btnLogin = driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions acc = new Actions(driver);
	acc.moveToElement (btnLogin).perform();
	WebElement btnSoftware = driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
	acc.moveToElement(btnSoftware).perform();
	WebElement btnSelenium = driver.findElement(By.xpath("//span[text()='Selenium']"));
	acc.moveToElement(btnSelenium).perform();
	btnSelenium.click();
	driver.quit();
}
}
