import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Saurav");
		driver.findElement(By.name("email")).sendKeys("Saurav123@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345678");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gen= new Select(gender);
		gen.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("25-05-1997");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		driver.close();
	}

}
