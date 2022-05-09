package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(4000);
			//we are switching frame 3
			driver.switchTo().frame("classFrame");
			driver.findElement(By.linkText("org.openqa.selenium.chromium")).click();
			
			Thread.sleep(4000);
			//switch to top frame
			driver.switchTo().defaultContent();
			driver.navigate().refresh();
			
			Thread.sleep(4000);
			//switch to frame 1 
			WebElement wb =driver.findElement(By.xpath("//iframe[@title='All Packages']"));
			
			driver.switchTo().frame(wb);
			driver.findElement(By.linkText("org.openqa.selenium.devtools")).click();
			
			Thread.sleep(4000);  
			//switch to top frame
			driver.switchTo().defaultContent();  
			driver.navigate().refresh();  
			
			Thread.sleep(4000);
			//Switch to frame 0  
			WebElement frame0 = driver.findElement(By.xpath("//iframe[@name='packageListFrame']"));  
			driver.switchTo().frame(frame0);  
			driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
			
			//driver.close();
		
		}

	}
