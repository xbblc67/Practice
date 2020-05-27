package rahul_Shetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
	/*    WebElement E = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select S = new Select(E);
		S.selectByIndex(3);
		S.selectByVisibleText("AED");
		
		// Selecting the adults
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		WebElement Adults = driver.findElement(By.id("divpaxinfo"));
		System.out.println(Adults.getText());
		for(int i=0;i<=3;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();;
	}

		driver.findElement(By.id("btnclosepaxoption")).click(); // submit the adults
		System.out.println(Adults.getText()); */
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
	//	driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[6]/a")).click();
		
	}





}





