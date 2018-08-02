package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.BasePage;

public class BaseTest extends BasePage {
	@BeforeClass
	public void initialSet() {
		this.initDriver();
	}
	
	@AfterClass
	public void tearDown() {
		this.closeDriver();
	}
}
