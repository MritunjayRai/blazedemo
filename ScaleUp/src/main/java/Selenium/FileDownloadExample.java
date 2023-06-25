package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class FileDownloadExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        String downloadDir = "path/to/download/directory";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--headless");
        options.setExperimentalOption("prefs", getChromePreferences(downloadDir));
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.example.com/download");
        WebElement downloadLink = driver.findElement(By.linkText("Download File"));
        downloadLink.click();
        driver.quit();
    }

    private static HashMap<String, Object> getChromePreferences(String downloadDir) {
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("download.default_directory", downloadDir);
        chromePrefs.put("download.prompt_for_download", false);
        chromePrefs.put("safebrowsing.enabled", true);
        return chromePrefs;
    }
}