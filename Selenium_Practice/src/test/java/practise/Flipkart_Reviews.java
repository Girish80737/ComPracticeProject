package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart_Reviews {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.get("https://www.flipkart.com/");
          WebElement ws = driver.findElement(By.name("q"));
               ws.sendKeys("mobiles");
               
               List<WebElement> suggestions = driver.findElements(By.cssSelector("ul._1sFryS li"));

               System.out.println("Autosuggestions for 'mobiles':");
               for (WebElement suggestion : suggestions) 
               {
                   System.out.println(suggestion.getText());
               }
               Actions action=new Actions(driver);
            WebElement motorola = driver.findElement(By.xpath("(//div[@class='YGcVZO _2VHNef'])[2]"));
            action.moveToElement(motorola).click().perform();
            driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
            
	}

}
