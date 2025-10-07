package practise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.io.FileHandler;

public class Working_With_Scrrenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		//Type cast to get the capabilities of take screenshot interface to get the driver instance
		//Type Casting
		TakesScreenshot ts=(TakesScreenshot)driver;
		//Temporary Location
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		//Destination File
		File destfile=new File("./ScreenShots/Homepage.png");
		FileHandler.copy(srcfile, destfile);

	}

}
