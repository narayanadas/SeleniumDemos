package dropdwonAndmultiselect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection{
public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium-workspace\\SeleniumDemos\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://www.omayo.blogspot.com");
		
		driver.manage().window().maximize();
		
		WebElement multiSelection = driver.findElement(By.id("multiselect1"));
		
		
		Select select = new Select(multiSelection);
		
		
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		
	}

}
