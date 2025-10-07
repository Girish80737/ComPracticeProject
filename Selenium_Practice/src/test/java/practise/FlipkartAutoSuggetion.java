package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipkartAutoSuggetion {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("puma");
		List<WebElement> wea = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
		for(WebElement als:wea)
		{
			System.out.println(als.getText());
		}
         }

}
