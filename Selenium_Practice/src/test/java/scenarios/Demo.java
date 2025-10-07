package scenarios;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.get("https://demoqa.com/");

          WebElement alertsFrameWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].click();", alertsFrameWindows);
 
		    WebElement alertsMenu = driver.findElement(By.xpath("//span[text()='Alerts']"));
		      js.executeScript("arguments[0].click();", alertsMenu);
		      WebElement promptButton = driver.findElement(By.id("promtButton"));
		        promptButton.click();
              Alert promptAlert = driver.switchTo().alert();
		        System.out.println("Prompt Text: " + promptAlert.getText());
		      
                
		        promptAlert.sendKeys("GIRISHNAIK L");
		        Thread.sleep(2000);
		        promptAlert.accept();

		        String result = driver.findElement(By.id("promptResult")).getText();
		        System.out.println("Result message: " + result);

		        Thread.sleep(3000);
		        driver.quit();
		    }
}


