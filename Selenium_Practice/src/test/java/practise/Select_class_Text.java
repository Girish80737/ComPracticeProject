package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class_Text {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("Books")).sendKeys("Mobiles");
		WebElement display = driver.findElement(By.id("products-orderby"));
		Select dropdown=new Select(display);
		List<WebElement> values = dropdown.getOptions();
		for(WebElement value:values)
		{
			System.out.println(value.getText());
		}

	}

}
