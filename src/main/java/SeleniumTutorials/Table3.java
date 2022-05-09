package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3 {
       static WebDriver driver;  
       
	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.redbus.in/");  
				
				WebElement wb = driver.findElement(By.id("onward_cal"));
				wb.click();
				Table3.datePicker("Aug 2023", "25");
				
				String a=wb.getAttribute("data-caleng");
				System.out.println(a);
				
			}

			public static void datePicker(String monthYear, String date) {

				while (true) 
				{
					String actualMonthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

					if (actualMonthYear.equals(monthYear)) {
						break;
					} else {
						driver.findElement(By.xpath("//td[@class='next']")).click();
					}
				}
				
				driver.findElement(By.xpath("//td[text()='"+date+"']")).click();

			}


	}
