package lightbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class lightbox {
	
	//form/div/input[@class='_2IX_2- VJZDxU']

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium-workspace\\SeleniumDemos\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String userid = "//input[@class='_2IX_2- VJZDxU']";
		String pswd = "//input[@type='password']";
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath(userid)).sendKeys("test");
		
		Actions act = new Actions(driver); 
		act.sendKeys(Keys.TAB);
		driver.findElement(By.xpath(pswd)).sendKeys("1234");
		driver.findElement(By.xpath(pswd)).sendKeys(Keys.ENTER);
		//act.sendKeys(Keys.ENTER);
		
	}
}
