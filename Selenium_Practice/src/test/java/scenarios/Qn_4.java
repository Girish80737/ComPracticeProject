package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Qn_4 {

	public static void main(String[] args) 
	{
      WebDriver driver =new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://demoqa.com/");
      
     //WebElement window = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
     // window.click();
     WebDriverWait we = new WebDriverWait(driver, Duration.ofSeconds(15));
      we.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[text()='Alerts, Frame & Windows']")));
	}
	
	}
