package SeleniumTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMinMax {


			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("https://www.amazon.com/");

				Thread.sleep(5000);
				
				driver.manage().window().minimize();
				
				Thread.sleep(5000);
				
				driver.manage().window().fullscreen();
				
				
				
				
				
			}

		}

