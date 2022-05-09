package SeleniumTutorials;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	

			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.google.com");
			
			
			TakesScreenshot ts =(TakesScreenshot)driver;
			
			File f =ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(f, new File("D:\\Sukanya_Automation\\Screenshot\\abc.png"));
			
			
			System.out.println("Screenshot capture");
			
			
		}


	}
