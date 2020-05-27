package WindowPopUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserThreeWindowPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		
		ArrayList<String> arr1 = windowid(driver);
		driver.switchTo().window(arr1.get(1)); // switch driver to child window
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(arr1.get(0)); // switch driver to parent window
		
		driver.findElement(By.linkText("Good PopUp #4")).click();
		ArrayList<String> arr = windowid(driver);		
		driver.switchTo().window(arr.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(arr.get(0));
		driver.quit();		
	}
		
		public static ArrayList<String> windowid(WebDriver driver) { // Will fetch window id for the parent and child window
	        ArrayList<String> arr = new ArrayList<String>();
			Set set = driver.getWindowHandles();
			List<String> list  = new ArrayList<String>(set) ;
			for(int i = 0; i<list.size();i++) {
			String text = list.get(i);
			arr.add(text);
			
		}
			return arr;

}
}
