package WindowPopUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.sound.midi.Synthesizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpWithList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		
		
		
/*	for(int i =0; i<list.size();i++) {
	         parentwindowId = list.get(i);
		     childwindowId = list.get(i+1);
			 // window id for parent and child window popup
} */
	     String parentWindowID = list.get(0);
         String childWindowID = list.get(1);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
		
		
		

	}

}
