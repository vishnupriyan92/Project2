package browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountId {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\vishn\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		driver.manage().window().maximize();
		WebElement StepsLogin = driver.findElement(By.xpath("//a[@href='javascript:stepsToLogin();']"));
		StepsLogin.click();
		String Pwindow = driver.getWindowHandle();
		Set<String> aWindow = driver.getWindowHandles();
		System.out.println(Pwindow);
		System.out.println(aWindow);
		for (String x : aWindow) {
			if (!Pwindow.equals(aWindow)) {
				driver.switchTo().window(x);
			}

		}
		WebElement Cid = driver.findElement(By.className("Instruction"));
		String text = Cid.getText();
		String[] countId = text.split(" ");
		int count = 0;
		for (String x : countId) {
			if (x.startsWith("id") || x.startsWith("ID")) {
				count = count + 1;

			}
		}
		System.out.println(count);
	}
}