package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E://Drivers//chromedriver_win32//chromedriver.exe");
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        int length = 200;
        int width =300;
        Dimension dim = new Dimension(width, length);
        driver.manage().window().setSize(dim);
       // driver.manage().window().maximize();
        driver.get("https://www.gmail.com");
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        Thread.sleep(2000);
        email.sendKeys("raimritunjay1992@gmail.com");
        next.click();
        password.sendKeys("Omega@1992");
        driver.quit();
        }
    }
