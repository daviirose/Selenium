package seltest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Othoba {

	  public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver(); // Imports chrome driver onto the system
	        driver.get("https://www.othoba.com/"); // Searches site on URL
	  
	        driver.findElement(By.linkText("Contact us")).click(); // Looks for Contact us then use click as method
	        driver.findElement(By.name("send-email")).click(); // Clicks on submit button but gets error
	        driver.findElement(By.id("FullName")).sendKeys("Davian Perez"); // Fills up name
	        driver.findElement(By.id("Email")).sendKeys("bigdavi99@ymail.com"); // Fills up Email
	        driver.findElement(By.id("Enquiry")).sendKeys("Dont email me please this is just practice"); // Fills Enquiry
	        driver.findElement(By.name("send-email")).click(); // Submits email
	        
	        driver.quit();
	    }

}
