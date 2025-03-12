package sit707_week1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author W.A. Charitha Dimuth Wickramanayake
 */
public class SeleniumOperations {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void open_chrome_and_close() {
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);
        sleep(5);
        driver.close();
    }

    public static void open_chrome_maximize_close() {
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);
        sleep(5);
        driver.manage().window().maximize();
        sleep(5);
        driver.close();
    }

    public static void load_web_page_close() {
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);
        sleep(5);
        driver.get("https://selenium.dev");
        sleep(5);
        driver.close();
    }

    public static void open_chrome_loadpage_resize_close() {
        System.out.println("Hello from 225094448, W.A. Charitha Dimuth Wickramanayake");
        System.out.println("Fire up Chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);
        sleep(2);
        driver.get("https://www.google.com");
        System.out.println("Google page loaded.");
        driver.manage().window().setSize(new Dimension(640, 480));
        System.out.println("Resized to 640x480");
        sleep(2);
        driver.manage().window().setSize(new Dimension(1280, 960));
        System.out.println("Resized to 1280x960");
        sleep(2);
        System.out.println("Closing browser.");
        driver.close();
    }
}
