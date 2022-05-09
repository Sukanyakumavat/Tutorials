package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {
	


				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				
				WebElement src =driver.findElement(By.id("box1"));
				
				WebElement target=driver.findElement(By.id("box101"));
				Thread.sleep(4000);
				
				Actions act =new Actions(driver);
				
				act.dragAndDrop(src, target).build().perform();
			
			}

		}

