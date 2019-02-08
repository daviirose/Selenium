package seltest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebooktwo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.name("firstname")).sendKeys("Cameron"); // Clicks on first name label and enters keys
        driver.findElement(By.name("lastname")).sendKeys("Garcia"); // Clicks on last name label and enters keys
        driver.findElement(By.name("reg_email__")).sendKeys("cameron@gmail.com"); // Clicks on email label and enters keys
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("cameron@gmail.com"); // Confirms email
        driver.findElement(By.name("reg_passwd__")).sendKeys("cameron123");// Enters password 
        WebElement dropMonth = driver.findElement(By.id("month"));
        Object dropdown;
		dropdown.selectByVisibleText("Mar");
        driver.findElement(By.className("_58mt")).click(); // Clicks male
        driver.findElement(By.name("websubmit")).click(); // Submits
    }

}