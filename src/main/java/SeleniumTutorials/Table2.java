package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
	static String expectedMonth="Aug 2022";
	static String date="20";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
			WebDriver driver = new ChromeDriver();
				driver.get("https://www.redbus.in/");
				
				driver.findElement(By.id("onward_cal")).click();
				
				
				while(true)
				{
					String capturedMonth=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
					System.out.println(capturedMonth);
					if(capturedMonth.equals(expectedMonth))
					{
						break;
					}
					else 
					{
						Thread.sleep(1000);
						driver.findElement(By.xpath("//td[@class='next']")).click();
					}
				}
				
				
				driver.findElement(By.xpath("//td[text()='"+date+"']")).click();
				
				String abc=driver.findElement(By.id("onward_cal")).getAttribute("data-caleng");
				System.out.println(abc);
				
				}

}