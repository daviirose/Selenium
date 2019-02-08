package seltest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spirit {

	  public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.spirit.com/");
	        driver.findElement(By.name("from")).click(); // Click where you leaving from
	        driver.findElement(By.name("from")).sendKeys("Philadelphia (PHL-All Airports)"); // Enter this after you click
	        driver.findElement(By.name("to")).click(); // Click on the "to" label
	        driver.findElement(By.name("to")).sendKeys("Los Angeles, CA (LAX)"); // Sends the keys to the "to" label
	        driver.findElement(By.name("departDate")).click(); // Clicks on departure date
	        driver.findElement(By.name("departDate")).sendKeys("02/20/2019"); // Sends in the keys
	        driver.findElement(By.name("returnDate")).click(); // Clicks on Return date
	        driver.findElement(By.name("returnDate")).sendKeys("02/28/2019"); // Sends in the keys
	        driver.findElement(By.xpath("//*[@id=\"book-travel-form\"]/div/p/button")).click(); // Clicks on submit button
	     
	        //driver.quit();
	    }

}
