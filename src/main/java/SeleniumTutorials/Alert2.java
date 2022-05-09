package SeleniumTutorials;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			Thread.sleep(4000);
			
			driver.findElement(By.name("proceed")).click();
			
			//how to switchTo alert pop.
			Alert alt =driver.switchTo().alert();
			
			//if want to capture the alert text() then we use getText()method
			String a=alt.getText();
			System.out.println(a);
			
			Thread.sleep(1000);
			//if u want to click on ok button then we use accept()method
			alt.accept();
				
		
			
		}
	}

