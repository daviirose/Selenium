package seltest;

import java.util.Scanner;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Company {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/web-table-element.php#");
        
        // Practice 1
        String group1 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]")).getText(); // Prints out first row of data
        System.out.print(group1); // Prints first row 
             
        // Practice 2
        // For loop
        for(int numberOfRows=1; numberOfRows<=20; numberOfRows++ ) { // Grabs each row 1 to 20 and goes up by 1 with ++
        
        // Parse float returns new value, then it find finds the element and prints numberOfRows that is over 500
        if(Float.parseFloat(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+numberOfRows+"]/td[4]")).getText()) > 500.0) {
        System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+numberOfRows+"]/td[1]")).getText());
         
   
        	}
        }
	}
}

	
        
       