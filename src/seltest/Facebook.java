package seltest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.name("firstname")).sendKeys("Davian"); // Clicks on first name label and enters keys
        driver.findElement(By.name("lastname")).sendKeys("Perez"); // Clicks on last name label and enters keys
        driver.findElement(By.name("reg_email__")).sendKeys("Davian@gmail.com"); // Clicks on email label and enters keys
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Davian@gmail.com"); // Confirms email
        driver.findElement(By.name("reg_passwd__")).sendKeys("Davian@gmail.com"); // Enters password 
        driver.findElement(By.className("_58mt")).click(); // Clicks male
        driver.findElement(By.name("websubmit")).click(); // Submits
    }

}