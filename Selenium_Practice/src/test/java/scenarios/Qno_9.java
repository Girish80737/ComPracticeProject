package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qno_9 
{

	public static void main(String[] args) 
	{
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.clinique.com/");
		driver.findElement(By.xpath("(//a[@class='text-link--style-2 gnav-block__courtesy-navigation-link'])[1]")).click();
		
		
	}
	}
