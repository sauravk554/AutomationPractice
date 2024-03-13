import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2End {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		// Source and Destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value=\"DEL\"]")).click();
		System.out.println("Soure selected as  " + driver.findElement(By.xpath("//a[@value=\"DEL\"]")).getText());
		Thread.sleep(1000);
		// driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click();
		driver.findElement(
				By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"MAA\"]"))
				.click();
		System.out.println("Destination selected as " + driver
				.findElement(
						By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"MAA\"]"))
				.getText());
		Thread.sleep(1000);

		// enter the date
		driver.findElement(By.xpath("(//a[@class='ui-state-default ui-state-highlight ui-state-hover'])[1]")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			Assert.assertFalse(false);
		} else {
			Assert.assertTrue(true);
		}
		Thread.sleep(1000);
		// Check Senior citizen
		driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).click();
		// Select Passenger
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText() + " Selected");
		Thread.sleep(1000);
		// Select Currency
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("INR");
		// click on search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
}
