package SeleniumTutorials;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 {


		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("http://127.0.0.1:5500/windowhandlemain.html");
			
			String parent =driver.getWindowHandle();
			
			System.out.println(parent);
			
			driver.findElement(By.linkText("Facebook register")).click();
			Thread.sleep(4000);
			
			Set<String> s= driver.getWindowHandles();
		
			System.out.println(s.size());
			
			for(String abc:s)
			{
				if(!(abc.equals(parent)))
				{
					driver.switchTo().window(abc);
					driver.findElement(By.name("firstname")).sendKeys("Abc");
					driver.findElement(By.name("lastname")).sendKeys("Abc");
					
				}
			}
			
			

		}
	}

