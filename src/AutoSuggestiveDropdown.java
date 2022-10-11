
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestiveDropdown {
	//https://www.makemytrip.com/
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium-workspace\\SeleniumDemos\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions copt = new ChromeOptions();
		copt.addArguments("disable-notificatons");
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		WebElement logo = driver.findElement(By.xpath("//a[@data-cy='mmtLogo']/img"));
		
		Actions act =  new Actions(driver);
		act.moveToElement(logo).click().build().perform();
			
			
			
		
	}

}
