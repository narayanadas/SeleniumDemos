package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class DragAndDrop3 {
 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium-workspace\\SeleniumDemos\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				 
		String URL = "https://demoqa.com/draggable/";
		 
		driver.get(URL);
		 
		// It is always advisable to Maximize the window before performing DragNDrop action		 
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		//Actions class method to drag and drop			
		Actions builder = new Actions(driver);
		 
		WebElement from = driver.findElement(By.id("draggable"));
		
		//Perform dragAndDropBy 
		builder.dragAndDropBy(from, 100,100).perform();		

		System.out.println("Dropped");

		driver.close();

	}
	
 
}