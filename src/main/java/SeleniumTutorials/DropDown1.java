package SeleniumTutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/reg/");
			
			//store the Drop down element.
			WebElement wb =driver.findElement(By.id("month"));  
			
			Thread.sleep(4000);
			
			// we create object of Select class by passing WebElement instance
			Select sel =new Select(wb);  
			List<WebElement> ls = sel.getOptions();  
			int d = ls.size();  
			System.out.println(d);  
			
			for(WebElement xyz: ls) {  
				String b = xyz.getText();
				System.out.println(b);
			}
			//it will select Aug month by using selectByValue() method
			sel.selectByValue("8");
			//sel.selectByIndex(4);
			
			
			WebElement abc =sel.getFirstSelectedOption();
			
			String a=abc.getText();
			
			System.out.println(a);
			

		}
	}

