package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
/*		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		
		Thread.sleep(4000);
	    WebElement element = driver.findElement(By.className("menulink"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element).build().perform();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("COURSES")).click(); */
		
		driver.get("http://spicejet.com");
		Thread.sleep(2000);
	    WebElement element = driver.findElement(By.id("ctl00_HyperLinkLogin"));
	    WebElement element1 = driver.findElement(By.linkText("SpiceClub Members"));
	    WebElement element2 = driver.findElement(By.linkText("Member Login")); 
	    Actions actions = new Actions(driver);
	    Thread.sleep(2000);
	    actions.moveToElement(element).build().perform();
	    
		
	    
	    

	}

}
