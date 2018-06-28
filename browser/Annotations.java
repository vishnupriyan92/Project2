package browser;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Annotations {
 static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishn\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com");
	}
	
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("beforemethod");
	}
	
	@After
	public void afterMethod() {
		System.out.println("Aftermethod");
	}
	
	@org.junit.Test
		public void test1(){
		System.out.println("test1");
	}
	
	@org.junit.Test
	public void test2() {
		System.out.println("test2");
	}
	
}
