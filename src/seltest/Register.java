package seltest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email_create")).click();
        driver.findElement(By.id("email_create")).sendKeys("Tanner@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Davian");
        driver.findElement(By.id("customer_lastname")).sendKeys("Perez");
        driver.findElement(By.id("passwd")).sendKeys("Davian123");
        
        driver.findElement(By.id("days")).click();
        driver.findElement(By.name("days")).sendKeys("28"); 
        driver.findElement(By.name("months")).click(); 
        driver.findElement(By.name("months")).sendKeys("February"); 
        driver.findElement(By.name("years")).click(); 
        driver.findElement(By.name("years")).sendKeys("1997"); 
        
        driver.findElement(By.id("firstname")).sendKeys("Davian");
        driver.findElement(By.id("lastname")).sendKeys("Perez");
        driver.findElement(By.id("company")).sendKeys("Thaddeus Stevens");
        driver.findElement(By.id("address1")).sendKeys("1100 E Oranage st");
        driver.findElement(By.id("city")).sendKeys("Lancaster");
        driver.findElement(By.id("id_state")).click();
        driver.findElement(By.id("id_state")).sendKeys("Pennsylvania");
        driver.findElement(By.id("postcode")).sendKeys("12234");
        driver.findElement(By.id("id_state")).click();
        driver.findElement(By.id("id_state")).sendKeys("United States");
        
        driver.findElement(By.id("phone_mobile")).sendKeys("7179541234");
        driver.findElement(By.id("alias")).sendKeys("1102 W Orange st");
        driver.findElement(By.id("submitAccount")).click();
	}
}
