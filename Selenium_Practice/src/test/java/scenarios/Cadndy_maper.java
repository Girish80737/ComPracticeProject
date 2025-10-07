package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cadndy_maper {

	public static void main(String[] args) 
	{
		
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://candymapper.com/");
     // driver.switchTo().alert().accept();
       driver.findElement(By.className("mfp-close")).click();
	}

}
