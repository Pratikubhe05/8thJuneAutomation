package coverFoxBase;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import coverFoxUtility.Utility;
public class Base {
	protected static WebDriver driver; // default-can be access through out the package only

	public void launchBrowser() throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(Utility.readDataFromPropertyFile("url"));
		Reporter.log("Launching Browser", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("Waiting..", true);

	}

	public void closeBrowser() {
		Reporter.log("Closing Browser", true);
		driver.quit();
	}

}
