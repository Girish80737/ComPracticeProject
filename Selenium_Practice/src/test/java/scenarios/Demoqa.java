package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException 
	{
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/");

        WebElement alertsFrameWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", alertsFrameWindows);
        
        driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        driver.switchTo().alert().getText();
       
        
}

}
