package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageBasic {
    static WebDriver driver;

    public PageBasic(WebDriver driver){
        this.driver = driver;
    }

    public static void openBrowser(String url, String path){
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.get(url);
    }

    public static void deleteCookies(){
        driver.manage().deleteAllCookies();
    }

    public static void closeBrowser(){
        driver.close();
    }

    public static void getTitle() {
        driver.getTitle();
    }
}
