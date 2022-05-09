package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {


			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.amazon.com/");
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung A32");
				
				driver.findElement(By.id("nav-search-submit-button")).click();
				Thread.sleep(5000);

				
				String c=driver.findElement(By.xpath("//div[@data-asin='B08X7Z278W']//span[@class='a-size-medium a-color-base a-text-normal']")).getText();
				
				System.out.println(c);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
				
				String b =driver.findElement(By.id("title")).getText();
				System.out.println(b);
				if(c.equals(b))
				{
					System.out.println("test case is pass");
				}
				else {
					System.out.println("test case is fail");
				}
				
			}


	}

