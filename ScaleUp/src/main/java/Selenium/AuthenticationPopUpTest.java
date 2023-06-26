package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUpTest {
    public static void main(String[] args) {
        // Set up the WebDriver configuration
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open the webpage with authentication
        String url = "http://username:password@your_website_url";
        driver.get(url);

        // Perform actions on the webpage
        // ...

        // Close the browser
        driver.quit();
    }
}