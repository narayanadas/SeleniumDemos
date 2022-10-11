package Actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium-workspace\\SeleniumDemos\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement blogsMenu = driver.findElement(By.id("blogsmenu"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(blogsMenu).perform();
		
		WebElement selenium143Option = driver.findElement(By.xpath("//li/a/span[text()='Selenium143']"));
		
		//a.moveToElement(selenium143Option).perform();
		
		//a.click(selenium143Option).perform();
		
		//the following line is code optimizations for the above two lines
		a.moveToElement(selenium143Option).click(selenium143Option).perform();
		
	}

}