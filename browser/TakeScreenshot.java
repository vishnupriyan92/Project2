package browser;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishn\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	/*//type cast
	TakesScreenshot F = (TakesScreenshot)driver;
	//temp file
	File Scr = F.getScreenshotAs(OutputType.FILE);
	//copy file
	FileUtils.copyFile(Scr, new File ("C:\\Users\\vishn\\eclipse-workspace\\Selenium\\src\\browser\\h.Jpg"));*/
	//driver.quit();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.MICROSECONDS);
	
}
}
