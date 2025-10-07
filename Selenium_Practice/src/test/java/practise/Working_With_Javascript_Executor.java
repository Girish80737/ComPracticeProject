package practise;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Working_With_Javascript_Executor {

	public static void main(String[] args) 
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://demowebshop.tricentis.com/");
      
      //Typecasting of JavaScriptExecutor with driver instance
       JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("document.get");
      
	}

}
