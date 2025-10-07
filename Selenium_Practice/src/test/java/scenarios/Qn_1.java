package scenarios;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class Qn_1 {

	public static void main(String[] args) 
	{
       
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.clinique.com/");
		Actions action=new Actions(driver);
		
		WebElement page = driver.findElement(By.xpath("(//li[@class='gnav-block__navigation-item js-gnav-block-navigation-item'])[4]"));
		  
		action.moveToElement(page).perform();
		String texts = page.getText();
	    System.out.println(texts);
	    
		
		}

}
