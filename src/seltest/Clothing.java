package seltest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clothing {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");  
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("Tanner@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Davian123");
        driver.findElement(By.id("SubmitLogin")).click();

        Actions action = new Actions(driver); // Gives you access to the Action class
        WebElement element = driver.findElement(By.linkText("DRESSES")); // Element defines the action then looks for the link text
        
		action.moveToElement(element).build().perform(); // Performs the action by looking for the text
		Thread.sleep(2000);
		driver.findElement(By.linkText("SUMMER DRESSES")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("selectProductSort")).sendKeys("Price: Lowest first");
		Thread.sleep(2000);
		
		WebElement dress1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
		action.moveToElement(dress1).build().perform(); // Hovers over dress
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")).click(); // Adds to cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click(); // Proceeds to checkout
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();// Proceed checkout
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click(); // Proceed checkout 
		Thread.sleep(2000);
		driver.findElement(By.id("cgv")).click(); // Agree box
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click(); // Proceed checkout
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click(); // Pay by check
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click(); // Confirm order
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a")).click(); // Back to order
		
		
	}
}