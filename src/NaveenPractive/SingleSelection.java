package NaveenPractive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelection {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		driver.findElement(By.id("justAnotherInputBox")).click();
		selectChoiceValues(driver,"choice 2 1");
		//	selectChoiceValues(driver,"ALL");
		DeselectChoiceValues(driver, "choice 2 1"); // Deselecting all

	}

	public static void selectChoiceValues(WebDriver driver, String value) {
		List<WebElement> choicelist = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));


		for(int i=0; i<choicelist.size();i++) {
			String text = choicelist.get(i).getText();
			System.out.println(text);

			if(text.equals(value)) {
				choicelist.get(i).click();
			}

		}
	}

	public static void DeselectChoiceValues(WebDriver driver, String value){

		List<WebElement> choicelist = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));


		for(int i=0; i<choicelist.size();i++) {
			String text = choicelist.get(i).getText();
			System.out.println(text);

			if(text.equals(value)) {
				choicelist.get(i).clear();
			}

		}
	}
}




