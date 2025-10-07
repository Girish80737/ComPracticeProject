package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Qno_7 {

	public static void main(String[] args) 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://testautomationpractice.blogspot.com/");
      
      Actions action=new Actions(driver);
      driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
     WebElement upload = driver.findElement(By.id("singleFileInput"));
     
    
	}

}
