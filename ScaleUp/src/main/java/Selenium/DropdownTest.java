package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {
    public static void main(String[] args) {
        // Set up the WebDriver configuration
        System.setProperty("webdriver.chrome.driver", "E://Drivers//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open the webpage
        driver.get("your_webpage_url");

        // Locate the dropdown element
        WebElement dropdown = driver.findElement(By.id("dropdownFruits"));

        // Create a Select object
        Select select = new Select(dropdown);

        // Iterate over the options and assert the presence of "Kiwi"
        boolean kiwiPresent = false;
        for (WebElement option : select.getOptions()) {
            if (option.getText().equals("Kiwi")) {
                kiwiPresent = true;
                break;
            }
        }

        // Assert that "Kiwi" is present
        if (kiwiPresent) {
            System.out.println("Kiwi is present in the dropdown.");
        } else {
            System.out.println("Kiwi is not present in the dropdown.");
        }

        // Close the browser
        driver.quit();
    }
}