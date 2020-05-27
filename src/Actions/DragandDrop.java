package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));
		
		Actions drag = new Actions(driver);
	//	drag.dragAndDrop(Source, Target).build().perform();
		
		drag.clickAndHold(Source).moveToElement(Target).release().build().perform();
		
		
		
		
		

	}

}
