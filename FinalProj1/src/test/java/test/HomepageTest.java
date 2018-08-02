package test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import pages.Homepage;

public class HomepageTest extends BaseTest {
	@Test
	public void testHome() {
		Homepage home = new Homepage();
		home.navigate("http://demoqa.com/");
		
		assertEquals(home.testTabsText(),"Mauris eleifend est et turpis. Duis id erat. Suspendisse potenti. Aliquam vulputate, pede vel vehicula accumsan, mi neque rutrum erat, eu congue orci lorem eget lorem. Vestibulum non ante. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Fusce sodales. Quisque eu urna vel enim commodo pellentesque. Praesent eu risus hendrerit ligula tempus pretium. Curabitur lorem enim, pretium nec, feugiat nec, luctus a, lacus.");
	}
}
