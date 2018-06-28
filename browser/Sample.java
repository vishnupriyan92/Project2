package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vishn\\eclipse-workspace\\Selenium\\lib\\chromedriver_win32.zip");
		WebDriver driver = new ChromeDriver();

	}
}
