package seltest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("12345"); // Clicks on text box label and enters keys
        driver.findElement(By.name("submit")).click(); // Clicks submit
        
        driver.switchTo().alert().accept(); // Accepts pop up alert
        String complete = driver.switchTo().alert().getText();// complete equals a function that switches to alert and receives text
        System.out.println(complete);// Prints complete string in the console
        driver.switchTo().alert().accept(); // Accepts pop up alert again
    }

}