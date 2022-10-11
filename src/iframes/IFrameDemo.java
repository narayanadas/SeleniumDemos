package iframes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IFrameDemo {
        public static void main(String[] args){
        	System.setProperty("webdriver.chrome.driver", "D:\\selenium-workspace\\SeleniumDemos\\driver\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
                
                //navigate to url
                driver.get("https://demoqa.com/frames");
                
                //Switch to Frame using id of the frame
                driver.switchTo().frame("frame1");
                
                //Identifying the heading in webelement
                WebElement frame1Heading= driver.findElement(By.id("sampleHeading"));
                
                //Finding the text of the heading
                String frame1Text=frame1Heading.getText();
                
                //Print the heading text
                System.out.println(frame1Text);
                
                //closing the driver
                driver.close();
        }
}