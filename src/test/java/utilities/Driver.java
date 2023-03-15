package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    private static String browser = Config.getValue("browser");

    public static WebDriver getDriver() {
        if (driver == null) {  //checking if the driver is null, if yes go to the next IF statement

            if (browser.equalsIgnoreCase("chrome")){  //checking the browser type
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            return driver;
        } else if (browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            return driver;
        }else {   //checking browser type
            System.out.println("Invalid Browser Type. Launching Default Browser");

            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            return driver;
        }
        }else{   //is the driver is null or no (1st if statement)
            return driver;
        }
    }


    public static void quitBrowser(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

}









