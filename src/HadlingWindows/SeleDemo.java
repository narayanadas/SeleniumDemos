package HadlingWindows;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleDemo {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium-workspace\\SeleniumDemos\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.omayo.blogspot.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Thread.sleep(5000);
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		String mainWindow = itr.next();
		System.out.println(mainWindow);		
		String childWindow = itr.next();
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);
		
		Thread.sleep(5000);
		
		driver.close();
		
		driver.switchTo().window(mainWindow);
		
		Thread.sleep(5000);
		
		driver.close();
	
	}

}