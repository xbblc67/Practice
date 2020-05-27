package NaveenPractive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuery1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		driver.findElement(By.id("justAnInputBox1")).click();
		selectChoiceValues(driver,"choice 1","choice 2 2");
		//	selectChoiceValues(driver,"ALL");
		DeselectChoiceValues(driver, "choice 1","choice 2 2"); // Deselecting all

	}

	public static void selectChoiceValues(WebDriver driver, String...value) {
		List<WebElement> choicelist = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));

		if (value[0].equalsIgnoreCase("ALL")) {
			try {
				for(int j =0;j<=choicelist.size();j++) {
					choicelist.get(j).click();  // It will select all the checkbox
				}

			}
			catch (Exception e) {

			}
		}

		else {
			for(int i=0; i<choicelist.size();i++) {
				String text = choicelist.get(i).getText();
				System.out.println(text);

				for(int k =0;k<value.length;k++) {
					if(text.equals(value[k])) {
						choicelist.get(i).click();
						break; // It will break the inner loop
					}
				}
			}
		}
	}
	public static void DeselectChoiceValues(WebDriver driver, String...values){
		selectChoiceValues(driver,"choice 1","choice 2 2");

	}
}




