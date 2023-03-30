package Suites;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;

import Test.TesteDBC;

@RunWith(Suite.class)
@SuiteClasses({ TesteDBC.class

})
public class SuiteGeral {
	private static WebDriver driver;

	@BeforeClass
	public static void reset() {
		driver.quit();
	}
}
