package seltest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Imdb {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.imdb.com/");  
        
        Actions action = new Actions(driver); // Gives you access to the Action class
        WebElement element = driver.findElement(By.linkText("Movies")); // 
        
		action.moveToElement(element ).build().perform();
		
		driver.findElement(By.linkText("Top Rated Movies")).click();
		driver.findElement(By.id("lister-sort-by-options")).click();
		driver.findElement(By.xpath("//*[@id=\"lister-sort-by-options\"]/option[2]")).click();
 
		// For loop
		for(int numberOfMovies=1; numberOfMovies<=250; numberOfMovies++ ) { // Movies 
		
		// Stores the path in a string															
		String movieName = driver.findElement(By.xpath("//table[@class='chart full-width']/tbody/tr["+numberOfMovies+"]/td[2]")).getText();
		
		// if the path through td[3] = 8.5 print etc.
		if(Float.parseFloat(driver.findElement(By.xpath("//table[@class='chart full-width']/tbody/tr["+numberOfMovies+"]/td[3]")).getText()) == 8.5) {
		System.out.println(movieName +" "+ driver.findElement(By.xpath("//table[@class='chart full-width']/tbody/tr["+numberOfMovies+"]/td[3]")).getText());
			}
		}
	}
}