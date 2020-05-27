package rahul_Shetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Salaesforce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("This is my first code");
        driver.findElement(By.name("pw")).sendKeys("123456"); // we can use id or name
        driver.findElement(By.xpath("//*[@id='Login']")).click(); // Right click the object and copy that xpath.

       

	}

}
