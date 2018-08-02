package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage extends BasePage {
	public String testTabsText() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dropdown-toggle")));
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#menu-item-153>a")));
		driver.findElement(By.cssSelector("#menu-item-153>a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-tabs-anchor")));
		driver.findElement(By.cssSelector(".ui-tabs-anchor")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tabs-1")));
		driver.findElement(By.cssSelector("#ui-id-3")).click();
		
		return driver.findElement(By.cssSelector("#tabs-3>p")).getText().toString();
	}
}
