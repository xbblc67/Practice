package NaveenPractive;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

	/*	String date = "10-02-2019";
		ArrayList<String> DayList = doselectdropdown(driver, day);
		System.out.println(DayList);
		ArrayList<String> MonthList = doselectdropdown(driver, month);
		System.out.println(DayList);
		ArrayList<String> YearList = doselectdropdown(driver, year);
		System.out.println(MonthList); */

		System.out.println("Total options in day list box is " + doselectdropdownsize(driver,day,"20"));
		System.out.println("Total options in day list box is " + doselectdropdownsize(driver,month,"4"));
		System.out.println("Total options in day list box is " + doselectdropdownsize(driver,year,"1990"));
	}

	public static int doselectdropdownsize(WebDriver driver, By locator, String value) {
		return doselectdropdown(driver,locator,value).size();
	}

	public static ArrayList<String> doselectdropdown(WebDriver driver, By locator, String value) {
		driver.findElement(locator).click();
		ArrayList<String> arr = new ArrayList<String>();
		Select S = new Select(driver.findElement(locator));
		List<WebElement> ListOptions =	S.getOptions();
	//	System.out.println(ListOptions.size());
		for(int i=0; i<ListOptions.size();i++) {
			String text = ListOptions.get(i).getText();
			//	System.out.println(text);
			arr.add(text);
			if(text.equals(value)) {
				ListOptions.get(i).click(); // if selectybvisibletext is not working then use this one.
				break;
			}
		}
		return arr;



	}
}