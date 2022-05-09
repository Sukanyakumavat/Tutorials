package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {


			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				driver.get("https://www.redbus.in/");
				//date box
				driver.findElement(By.id("onward_cal")).click();
				//it will capture month and year
				Thread.sleep(3000);
				String abc="Dec 2027";
				
				while(true)
				{
					String a=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
					//Apr 2022		May 2022  Jun 2022
					System.out.println(a);
					
					if(a.equals(abc))
					{
						break;
					}
					else 
					{
						Thread.sleep(1000);
						//it click on next button.
						driver.findElement(By.xpath("//td[@class='next']")).click();
					}
				}
				
			
			}

	}

