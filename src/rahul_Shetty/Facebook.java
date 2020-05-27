package rahul_Shetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
	//	driver.findElement(By.xpath("//*[@type = 'email']")).sendKeys("panju");
	//	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pass");
	//	driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("pankaj");
	//	driver.findElement(By.cssSelector("[type = 'email']")).sendKeys("panju");
		driver.findElement(By.cssSelector("[id = 'pass']")).sendKeys("pass");
		driver.findElement(By.cssSelector("[type = 'submit']")).click();
		driver.findElement(By.cssSelector("#username")).sendKeys("pankaj");
		
		

	}

}
