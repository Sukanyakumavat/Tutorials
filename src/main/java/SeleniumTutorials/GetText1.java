package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText1 {

 
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver =new ChromeDriver();
			driver.get("https://www.google.com");
			
			WebElement gmailLink =driver.findElement(By.linkText("Gmail"));
			
			if(gmailLink.isDisplayed())
			{
				if(gmailLink.isEnabled())
				{
					String a=gmailLink.getText();
					System.out.println(a);
					gmailLink.click();
				}
			}
			else {
				System.out.println("Gmail link is not displayed");
			}
			
		
			
		}

	}



