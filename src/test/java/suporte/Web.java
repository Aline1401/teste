package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static WebDriver createChrome() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
		driver.manage().window().maximize();

		return driver;

	}
}