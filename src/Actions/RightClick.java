package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RightClick {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickMe = driver.findElement(By.cssSelector("span.context-menu-one"));
//		WebElement rightClickMe = driver.findElement(By.className("span.context-menu-one"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClickMe).build().perform();
		List<WebElement> options = driver.findElements(By.xpath("//li[contains(@class,'context-menu-icon')]/span"));
		System.out.println(options.size());
		for(int i =0; i<options.size(); i++) {
			String text = options.get(i).getText();
			if(text.equalsIgnoreCase("Edit")) {
				options.get(i).click();
				break;
				
			}
			
		}
		
		
		
		
		

	}

}
