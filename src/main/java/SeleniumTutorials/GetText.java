package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver =new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				String a=driver.findElement(By.className("_8eso")).getText();
				System.out.println(a);
				if(a.contains("connect"))
				{
					System.out.println("Test case is passs");
				}
				else {
					System.out.println("Test case is fail");
				}
				
				
			}

	}

