package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToParent {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium-workspace\\SeleniumDemos\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to the demo site
		driver.get("https://demoqa.com/nestedframes");

		// Number of Frames on a Page
		int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames on a Page:" + countIframesInPage);

		// Locate the frame1 on the webPage
		WebElement frame1 = driver.findElement(By.id("frame1"));

		// Switch to Frame1
		driver.switchTo().frame(frame1);

		// Number of Frames on a Frame1
		int countIframesInFrame1 = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames inside the Frame1:" + countIframesInFrame1);

		// Swiitch to child frame
		driver.switchTo().frame(0);
		int countIframesInFrame2 = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames inside the Frame2:" + countIframesInFrame2);

		// Switch to Parent iFrame
		driver.switchTo().parentFrame();

		// Locate the Element inside the Frame1
		WebElement frame1Element = driver.findElement(By.tagName("body"));

		// Get the text for frame1 element
		String frame1Text = frame1Element.getText();

		// Try to Print the text present inside parent frame
		System.out.println("Frame1 is :" + frame1Text);
		driver.close();
	}
}