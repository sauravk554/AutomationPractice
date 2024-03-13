import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saura\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		// System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(0);
		// System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(1);
		// System.out.println(driver.findElements(By.tagName("frame")).size());
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.close();
	}
}
