package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Table4 {

		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			Thread.sleep(4000);
			
			driver.findElement(By.id("btnLogin")).click();

			driver.findElement(By.xpath("//*[text()='PIM']")).click();
			driver.findElement(By.name("btnAdd")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("firstName")).sendKeys("abc");
			driver.findElement(By.id("lastName")).sendKeys("xyz");
			Thread.sleep(4000);
			driver.findElement(By.id("btnSave")).click();

			driver.findElement(By.id("btnSave")).click();
			driver.findElement(By.id("personal_txtLicExpDate")).click();
			Thread.sleep(4000);
			WebElement wb = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			
			Table4.selectValue(wb, "Aug");
			WebElement year =driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Thread.sleep(2000);
			Table4.selectValue(year, "2023");
			
			driver.findElement(By.xpath("//a[text()='15']")).click();
			
			Thread.sleep(4000);
			String a=driver.findElement(By.id("personal_txtLicExpDate")).getText();
		
			System.out.println(a);
		}

		public static void selectValue(WebElement wb, String value) {
			Select sel = new Select(wb);
			sel.selectByVisibleText(value);
		}

	}

