package seltest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoaut {

	  public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://newtours.demoaut.com/mercuryregister.php"); 
	        driver.findElement(By.name("firstName")).sendKeys("Davian"); // Each one will fill in the info with different key values
	        driver.findElement(By.name("lastName")).sendKeys("Perez");
	        driver.findElement(By.name("userName")).sendKeys("davii18181");
	        driver.findElement(By.name("phone")).sendKeys("18178273821");
	        driver.findElement(By.name("address1")).sendKeys("Pluto apt 1");
	        driver.findElement(By.name("city")).sendKeys("Pluto City");
	        driver.findElement(By.name("state")).sendKeys("Plutai");
	        driver.findElement(By.name("postalCode")).sendKeys("18097"); 
	        driver.findElement(By.id("email")).sendKeys("bigdavian@yahoo.com");
	        driver.findElement(By.name("password")).sendKeys("davian97.");
	        driver.findElement(By.name("confirmPassword")).sendKeys("davian97.");
	        
	        driver.findElement(By.name("register")).sendKeys(Keys.ENTER); // Looks for submit button with register tag and enter/clicks
	        driver.quit(); // Quits browser

	    }

}
