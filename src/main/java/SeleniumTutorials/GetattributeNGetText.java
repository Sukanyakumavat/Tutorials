package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetattributeNGetText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C://Users//DELL//Downloads//chromedriver_win32//chromedriver.exe");
     WebDriver driver = new ChromeDriver();  
     driver.get("https://www.facebook.com/reg");  
     Thread.sleep(4000);
     driver.findElement(By.name("firstname")).sendKeys("Selenium");  
     driver.findElement(By.name("lastname")).sendKeys("Password");  
     
     WebElement wb = driver.findElement(By.name("websubmit"));  
     
     System.out.println(wb.getText());  
     wb.click();
     
    
    
	}

}
