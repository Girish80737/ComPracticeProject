package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalHost {

	public static void main(String[] args) 
	{

		WebDriver driver =new ChromeDriver();
		driver.get("http://49.249.28.218:8888/");
	}

}
