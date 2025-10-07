package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//getCss Value
		String register_link = driver.findElement(By.linkText("Register")).getCssValue("color");
		System.out.println(register_link);
		
		String font_value = driver.findElement(By.linkText("Register")).getCssValue("font-family");
		System.out.println(font_value);

	}

}
