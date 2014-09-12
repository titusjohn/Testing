import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Simpletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Triggered the script");
		
		 WebDriver driver = new FirefoxDriver();
	        
	        // Go to the Google Suggest home page
	        driver.get("http://www.google.com/webhp?complete=1&hl=en");
	        
	        // Enter the query string "Cheese"
	        WebElement query = driver.findElement(By.name("q"));
	        query.sendKeys("Cheese");
	        
	        query.submit();
	
	        //driver.quit();
	    }	

}
