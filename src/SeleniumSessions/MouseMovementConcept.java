package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");	
				WebDriver driver = new ChromeDriver(); //launch chrome
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				driver.get("http://spicejet.com/");
				Actions actions = new Actions(driver);
				WebElement mainMenu = driver.findElement(By.xpath("//span[contains(text(), 'Manage Booking')]"));
				actions.moveToElement(mainMenu);

				Thread.sleep(1000);
				WebElement subMenu = driver.findElement(By.xpath("//span[contains(text(), 'Holiday Packages')]"));
				actions.moveToElement(subMenu);
				actions.click().build().perform();
				
				/*Actions action = new Actions(driver);
				
				action.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
				
				Thread.sleep(3000);
				
				driver.findElement(By.linkText("Fleet")).click();
	}*/
}
}
