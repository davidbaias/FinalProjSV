package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String platform;
	public static String app;
	
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait =  new WebDriverWait(driver, 30);
	}
	
	public void closeDriver() {
		driver.close();
		if(driver.equals(null)) {
			driver.quit();
		}
	}
	
	public void navigate(String url) {
		driver.navigate().to(url);
	}
}
