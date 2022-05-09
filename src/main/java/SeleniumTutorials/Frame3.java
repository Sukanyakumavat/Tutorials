package SeleniumTutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame3 {


		static WebDriver driver;
		static List<WebElement> ls;
		
		public static void checkBox() {
			
			for (WebElement abc : ls) {
				abc.click();
				System.out.println(abc.isSelected());
			}
		}

		public static void captureAndclear(WebElement wb) {
			String ab = wb.getAttribute("value");
			System.out.println(ab);
			wb.clear();
		}
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			Thread.sleep(4000);
			driver.get("file:///D:/HTMLCode%20New%20Student/New%20folder/frame.html");

			WebElement name = driver.findElement(By.id("name"));

			name.sendKeys("Selenium Testing");

			Thread.sleep(4000);
			driver.switchTo().frame("mainframe");
			WebElement address = driver.findElement(By.id("add"));
			address.sendKeys("Pune MH");

			Thread.sleep(4000);
			driver.switchTo().frame("child1");
			ls = driver.findElements(By.xpath("//input[@type='checkbox']"));

			Frame3.checkBox();

			Thread.sleep(4000);
			driver.switchTo().frame("child2");

			WebElement coursename = driver.findElement(By.id("course"));
			Select sel = new Select(coursename);
			sel.selectByValue("9");
			WebElement wb = sel.getFirstSelectedOption();
			System.out.println(wb.getText());

			for (WebElement abcd : sel.getOptions()) {
				System.out.println("All Dp Value is " + abcd.getText());
			}

			Thread.sleep(4000);
			driver.switchTo().parentFrame();
			
			Frame3.checkBox();

			driver.switchTo().parentFrame();

			Frame3.captureAndclear(address);
			
			Thread.sleep(4000);
			driver.switchTo().defaultContent();

			Frame3.captureAndclear(name);

	}

	}


