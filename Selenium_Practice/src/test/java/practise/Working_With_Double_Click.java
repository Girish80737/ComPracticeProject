package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Double_Click {

	public static void main(String[] args) 
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
     Actions action = new Actions(driver);
    //WebElement doubl = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
     WebElement doubl = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
     
		action.contextClick(doubl).build().perform();
		//WebElement doubls = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		//action.moveToElement(doubls).doubleClick().build().perform();
		//WebElement driv = driver.findElement(By.xpath("(//img[@decoding='async'])[2]"));
		action.scrollByAmount(0, 5000);
	}

}
