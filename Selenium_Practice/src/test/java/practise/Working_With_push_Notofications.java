package practise;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;

public class Working_With_push_Notofications {

	public static void main(String[] args) throws InterruptedException 
	{
      ChromeOptions options=new ChromeOptions();
      options.addArguments("__disable_notifications");
      
      //options.addArguments("__disable_notifications");
      
      WebDriver driver=new ChromeDriver(options);
      Thread.sleep(3000);
	  driver.get("https://www.easemytrip.com/");
		}
}
