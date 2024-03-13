import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		// CheckBox selection
		// This will check the checkbox is selected or not and will return the boolean
		// value
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).isSelected());
		// if above code will get false value then below condition will pass otherwise
		// it will fail.
		Assert.assertFalse(false);
		System.out.println(driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).isSelected());
		driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).isSelected());

		// This will check the checkbox is selected or not and will return the boolean
		// value
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).isSelected());
		// if above code will get true value then below condition will pass otherwise it
		// will fail.
		Assert.assertTrue(true);

		// count of checkbox into page
		System.out.println("Total checkbox present in page is "
				+ driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
		Thread.sleep(1000);

		// Updated Dropdown Example
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText() + " Selected");

		driver.close();
	}

}
