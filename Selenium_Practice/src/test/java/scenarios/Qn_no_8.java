package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Qn_no_8 {

	public static void main(String[] args) 
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://testautomationpractice.blogspot.com/");
     
      driver.findElement(By.id("comboBox")).click();
      
      driver.findElement(By.xpath("(//div[@class='option'])[10]")).click();
	}

}
