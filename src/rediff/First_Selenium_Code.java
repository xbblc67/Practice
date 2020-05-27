package rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class First_Selenium_Code {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\SELENIUM BROWSER DRIVERS\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "F:\\SELENIUM\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://rediff.com");
		
		
		String expectedlandingpagetitle = driver.getTitle();
		String actuallandingpagetitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		if(expectedlandingpagetitle.equals(actuallandingpagetitle)) {
			System.out.println("This validation is PASS");
		}else {
			System.out.println("This validation is FAIL");
		}
		String expectedlandingpageurl = driver.getCurrentUrl();
		String actuallandingpageurl = "https://www.rediff.com/";

		if(expectedlandingpageurl.equals(actuallandingpageurl)) {
			System.out.println("This validation is PASS");
		}else {
			System.out.println("This validation is FAIL");
		}
		
		driver.findElement(By.className("signin")).click();
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");  
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("rd_logout")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class = 'hide']/following::div[@class = 'header']/descendant::b[1]")).click();
        
	}

}
