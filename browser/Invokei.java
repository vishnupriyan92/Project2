package browser;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Invokei {
	public static void main(String[] args) {
		//config the driver
			/*System.setProperty("webdriver.ie.driver", "C:\\Users\\vishn\\eclipse-workspace\\Selenium\\driver\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			// URl
			driver.get("https://www.amazon.in");
			//title
			String title = driver.getTitle();
			System.out.println(title);
			//current url
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			//quit
			driver.quit();*/
		Map<String,Integer> emp=new HashMap<>();
		emp.put("k",1);
		emp.put("k1",2);
		Set<String> keySet = emp.keySet();
		Collection<Integer> values = emp.values();
		System.out.println(values);
		
		
	}
}
