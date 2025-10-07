package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class_Display_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		
		WebElement display=driver.findElement(By.id("products-pagesize"));
		Select display_dropdown=new Select(display);
		List<WebElement> display_values = display_dropdown.getOptions();
		
		for(WebElement display_value:display_values)
		{
			System.out.println(display_value.getText());
		}

	}

}
