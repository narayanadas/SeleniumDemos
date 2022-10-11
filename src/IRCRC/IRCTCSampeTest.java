package IRCRC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IRCTCSampeTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium-workspace\\SeleniumDemos\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		System.out.println("Title" + driver.getTitle());
		System.out.println("URL" + driver.getCurrentUrl());

		

		Thread.sleep(5000);
		
		Actions a =new Actions(driver);
		WebElement alertOK = driver.findElement(By.xpath("//div/button[@class='btn btn-primary']"));
		a.moveToElement(alertOK).click(alertOK).perform();
		
		System.out.println("Alter Clicked");
		
	}

}
