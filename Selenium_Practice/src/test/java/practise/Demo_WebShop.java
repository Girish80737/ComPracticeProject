package practise;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WebShop {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();		
//import org.openqa.selenium.WebDriver;
        
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
        Thread.sleep(3000);
         driver.findElement(By.cssSelector("input[class='button-1 search-box-button'")).click();     
        
        
        
	}

}
