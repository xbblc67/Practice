package rediff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LandingPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\SELENIUM BROWSER DRIVERS\\chromedriver.exe");
	//	System.setProperty("webdriver.gecko.driver", "F:\\SELENIUM\\SELENIUM BROWSER DRIVERS\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
	}

}
