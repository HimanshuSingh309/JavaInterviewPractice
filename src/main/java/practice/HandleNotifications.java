package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HandleNotifications {
    public static void main(String[] args) {
       

        // Create ChromeOptions object to handle preferences
        ChromeOptions options = new ChromeOptions();

        // Allow notifications
        options.addArguments("--enable-notifications");

        // Initialize ChromeDriver with ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // Open cardekho.com
        driver.get("https://www.cardekho.com/");

        // Wait for the alert to appear
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        // Switch to the alert and accept it
//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        // Your further automation steps here

        // Close the browser
        
    }
}
