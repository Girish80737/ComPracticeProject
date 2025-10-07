package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Automation_Blogspot {
@Test
	public  void dragAndDrop() 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://testautomationpractice.blogspot.com/");
      
      Actions action=new Actions(driver);
      
     WebElement drag = driver.findElement(By.id("draggable"));
     WebElement drop = driver.findElement(By.id("droppable"));
    
     action.dragAndDrop(drag, drop).build().perform();
     
    // driver.findElement(By.id("comboBox")).click();
    // driver.findElement(By.xpath("(//div[@class='option'])[10]")).click();
	}

}
