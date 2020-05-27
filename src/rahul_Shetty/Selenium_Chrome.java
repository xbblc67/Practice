package rahul_Shetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Chrome {
	
	// create the driver object for chrome browser
	// Then implement the methods of chrome driver

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("http://google.com");
//		System.out.println(driver.getCurrentUrl()); // to validate if we landed on correct url
	//	driver.get("http://facebook.com");
		driver.get("https://www.amazon.in");
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
 //       System.out.println(driver.getTitle()); // To validate if our page title is correct or not
      WebElement element =  driver.findElement(By.id("email"));
      System.out.println("element is" + element);
      System.out.println("Hi");
 //       driver.findElement(By.name("pass")).sendKeys("123456"); // we can use id or name
 //       driver.findElement(By.linkText("Forgotten account?")).click();
//        driver.findElement(By.cssSelector(cssSelector))
       
  //      driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Password");
   //     driver.findElement(By.xpath("//*[@id='u_0_b']")).click(); // login
        
        
		

	//	System.out.println(driver.getPageSource());
	//	driver.navigate().to("http://yahoo.com");
	///	driver.navigate().back();
	////	driver.close(); // It will close only the current browser
	//	driver.quit(); // It will close all the browsers opened by selenium scripts.
        
	}

}
