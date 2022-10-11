package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium-workspace\\SeleniumDemos\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// navigate to url
		driver.get("https://demoqa.com/frames");

		// Locating frame1 using its id
		WebElement frame1 = driver.findElement(By.id("frame1"));

		// Switching the WebDriver context to frame1
		driver.switchTo().frame(frame1);

		// Identifying the frame heading in a WebElement
		WebElement frame1Heading = driver.findElement(By.id("sampleHeading"));

		// Finding the text of the frame1 heading
		String frame1Text = frame1Heading.getText();

		// Print the heading
		System.out.println("Text of the frame1 heading is:" + frame1Text);

		// closing the driver
		driver.close();
	}
}