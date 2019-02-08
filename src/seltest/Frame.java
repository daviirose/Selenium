package seltest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe?fbclid=IwAR1DRAFIaCE-Zj1XpJC7JkBwQOwkyoPCn-ZQaVSPWlPO1ZP_CNU8IoemS6k");
        driver.findElement(By.id("mceu_15-open")).click(); // Clicks on file
        driver.findElement(By.id("mceu_32")).click(); // Clicks on New Document
        
        driver.switchTo().frame("mce_0_ifr"); // Switches to IFrame mode
        driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Davian "); // Creates a path to the text box and sends keys
        driver.switchTo().defaultContent(); // Takes you out IFrame
        
        driver.switchTo().frame("mce_0_ifr"); // Switches to IFrame mode
        driver.findElement(By.id("tinymce")).sendKeys(Keys.chord(Keys.COMMAND, "a")); //Highlights text
        driver.findElement(By.id("tinymce")).sendKeys(Keys.CONTROL, Keys.INSERT); // Copies text
        driver.switchTo().defaultContent(); // Takes you out IFrame
        
        driver.switchTo().frame("mce_0_ifr"); // Switches to IFrame mode 
        driver.findElement(By.xpath("//body[@id='tinymce']")).click(); // Access to text box then click on it
        driver.findElement(By.id("tinymce")).sendKeys(Keys.SHIFT, Keys.INSERT); //  Paste Text
        
        driver.findElement(By.id("tinymce")).sendKeys(Keys.chord(Keys.COMMAND, "a")); // Highlights text
        driver.findElement(By.id("tinymce")).sendKeys(Keys.chord(Keys.COMMAND, "b")); // Bold's text
        driver.switchTo().defaultContent(); // Takes you out IFrame
        driver.findElement(By.id("mceu_9")).click(); // Clicks on Bullet list
    }

}