package SeleniumTutorials;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert pune =driver.switchTo().alert();
		Thread.sleep(4000);
		
		//capture the text
		System.out.println(pune.getText());
		
		//click on cancel button
		pune.dismiss();
		
		String a =driver.findElement(By.id("result")).getText();
		
		if(a.contains("Cancel"))
		{
			System.out.println("test case is Pass");
		}
		else {
			System.out.println("Test case is fail");
		}
		
		Thread.sleep(4000);
		
		driver.quit();
		

	}

}
