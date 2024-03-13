import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {
	public static void main(String[] args)
	{
		//ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saura\\Documents\\Selenium\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		
		//Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saura\\Documents\\Selenium\\geckodriver.exe");	
		WebDriver driver2= new FirefoxDriver();
		
		//MSEdge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\saura\\Documents\\Selenium\\msedgedriver.exe");	
		WebDriver driver3= new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println("This is webpage title : "+driver.getTitle());
		System.out.println("This is webpage url : "+driver.getCurrentUrl());
		driver.close(); 
		//driver.quit();
	}
}
