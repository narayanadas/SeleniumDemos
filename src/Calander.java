
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium-workspace\\SeleniumDemos\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		//System.out.println(driver.findElement(By.className("datepicker-switch")).getText());
		while(!driver.findElement(By.className("datepicker-switch")).getText().contains("December")) {
			driver.findElement(By.className("next")).click();
		}
		
		//List<Webelement> days = driver.findElements(By.className("day"));
	}
}
