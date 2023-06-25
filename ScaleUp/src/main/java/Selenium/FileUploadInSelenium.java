package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadInSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E://Drivers//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com/upload");
        WebElement fileInput = driver.findElement(By.id("fileInput"));
        String filePath = "path/to/file";
        fileInput.sendKeys(filePath);
        driver.close();
    }
}
