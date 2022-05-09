package seleniumTutorials1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class BaseClass {
	public static WebDriver driver;

	public static void initlization() 
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file://D:/HTMLCode%20New%20Student/New%20folder/frame.html");
			}

}
