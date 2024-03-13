import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCalendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		// click the round trip radio button and check if the second date is enabled or
		// not
		// System.out.println("Round Trip is enabled
		// "+driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		// //not working
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_originStation1_CTNR\"]//a[@value=\"BLR\"]"))
				.click();
		System.out.println("Soure selected as  " + driver
				.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_originStation1_CTNR\"]//a[@value=\"BLR\"]"))
				.getText());
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

		// Select dates
		// driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println("Departure Date is "
				+ driver.findElement(By.cssSelector(".ui-state-active")));

	}

}
