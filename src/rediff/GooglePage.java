package rediff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePage {
		public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver" , " Path of your chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://rediff.com");
			
			//Selenium gives us 5 different methods to validate any webpage
			//getTitle(), getCurrentUrl(), isEnabled(), isDisplayed(), isSelected()
			//getTitle() and getCurrentUrl() they return String
			//isEnabled(), isDisplayed(), isSelected() they return boolean
			
			String ActualTitle = driver.getTitle();
			//Rediff.com: News | Rediffmail | Stock Quotes | Shopping
			
			String ExpectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
			
			if(ActualTitle.equals(ExpectedTitle)) {
				System.out.println("This is the correct Landing Page : " + ExpectedTitle );


	}

}
}