package browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Table {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishn\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-table/");
	List <WebElement> tRows = driver.findElements(By.tagName("tr"));
	for(int i=0; i<tRows.size(); i++) {
		List <WebElement> tData = tRows.get(i).findElements(By.tagName("td"));
		for(int j=0; j<tData.size(); j++) {
		System.out.println(tData.get(j).getText());
		}
	}
}
}
