import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		// Static Dropdown example
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println("Currency selected " + dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("AED");
		System.out.println("Currency selected " + dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("INR");
		System.out.println("Currency selected " + dropdown.getFirstSelectedOption().getText());

		// Updated Dropdown Example
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		/*
		 * int i=1; while (i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++;
		 * }
		 */
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText() + " Selected");
		driver.findElement(By.id("btnclosepaxoption")).click();

		// Dynamic Dropdown examples
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);

		// Auto Suggestive Dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		
		//CheckBox selection
		driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).isSelected());
		
		//count of checkbox into page
		System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
		
		driver.close();
	}
}
