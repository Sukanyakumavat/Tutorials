package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {


			public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
				
				driver.switchTo().frame(2);
				
				driver.findElement(By.linkText("org.openqa.selenium")).click();
				
				
				
				
			}

		
	}

