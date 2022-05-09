package SeleniumTutorials;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://prafpawar11.github.io/rightclick2.html");

			WebElement wb = driver.findElement(By.id("btn2"));

			// we have to create object of the Actions class by passing WebDriver instance

			Actions act = new Actions(driver);

			act.contextClick(wb).build().perform();

			Alert al = driver.switchTo().alert();

			String a = al.getText();

			if (a.contains("Right Click!")) {
				System.out.println("test cases is pass");
			} else {
				System.out.println("test case is fail");
			}

			al.accept();

			driver.quit();
			

		}

	}

