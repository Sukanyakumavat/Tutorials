package SeleniumTutorials;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction1 {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.com/");
			
			Thread.sleep(4000);
			
			
			Actions act =new Actions(driver);
			
			act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
			
			//act.sendKeys(Keys.END).build().perform();
		
			
		}

	}
