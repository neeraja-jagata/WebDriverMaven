package basicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	@Test
	public void login() {
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("neerujagata@gmail.com"+Keys.ENTER);
		System.out.println(driver.getTitle());
	}
	@AfterSuite
	public void tearDown() {
		driver.quit();
		
	}
	
}
