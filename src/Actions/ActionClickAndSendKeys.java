package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClickAndSendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(6000);
		WebElement user = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("loginBtn"));
		
		Actions actions = new Actions(driver);
		actions.sendKeys(user, "panju").build().perform();;
		actions.sendKeys(pass,"password").build().perform();;
		actions.click(login).build().perform();
		
		
		
		

	}

}
