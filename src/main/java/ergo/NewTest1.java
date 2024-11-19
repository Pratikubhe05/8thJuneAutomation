package ergo;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTest1 {
	WebDriver driver = new ChromeDriver();

	@Test
	public void login() throws InterruptedException {
		driver.get("https://uatamit.hdfcergo.com/lmsuat/webforms/frmLogin.aspx");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath(
				"//table[@style='width: 650px']/tbody/tr[2]/td[2]//input[@name='ctl00$ContentPlaceHolder1$txtUserID']"))
				.sendKeys("aaron1");
		driver.findElement(By.xpath(
				"//table[@style='width: 650px']/tbody/tr[2]/td[4]//input[@name='ctl00$ContentPlaceHolder1$txtUserPass']"))
				.sendKeys("Ergo@1234567");
		driver.findElement(By.xpath(
				"//table[@style='width: 650px']/tbody/tr[2]/td[5]//input[@id='ctl00_ContentPlaceHolder1_btnSubmit']"))
				.click();
		Thread.sleep(1000);
		// driver.close();
	}

	@Test
	public void search() // mouse over on search button
	{
		WebElement searchButton = driver.findElement(By.xpath("//table[@id='ctl00_mainmenu']/tbody/tr/td[@id='ctl00_mainmenun0']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(searchButton).perform();
	}

	@Test
	public void search2() // to select options from the list
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement assignToSub = driver.findElement(By.xpath("(//table[@cellspacing='0'])[9]/tbody/tr/td/a[text()='Assign to Sub-vet']"));
		assignToSub.click();
	}
	
	@Test
	public void enterLeadNumber()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement leadnumber = driver.findElement(By.xpath("//table[@cellpadding='5px']/tbody/tr[2]/td[2]/input[@name='ctl00$ContentPlaceHolder1$txtLeadNo']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='CTH1611202400004'", leadnumber);
	}

}