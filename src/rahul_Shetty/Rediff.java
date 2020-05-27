package rahul_Shetty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		By username = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		
	//	 driver.findElement(By.xpath("//*[@id='Login']")).click();
	//	driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
	//	driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Login username"); // by regular expression
	//	driver.findElement(By.cssSelector("input#password")).sendKeys("password"); // only when id is there
	//	driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click(); 
		
		driver.findElement(username).sendKeys("naveenanimation30@gmail.com");
		driver.findElement(password).sendKeys("Test@1234");
		driver.findElement(loginButton).click();
		

	}

}
