package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver getdriver(String url) {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\vishn\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	public void type(WebElement element, String name) {
		element.sendKeys(name);
	}

	public void btn(WebElement element) {
		element.click();
	}
	// public void quit BrowserAppln (WebElement.element) {
	// driver.quit();
}
