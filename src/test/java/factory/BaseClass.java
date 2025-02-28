package factory;

import java.time.Duration;
import java.util.ResourceBundle;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public BaseClass(WebDriver driver2) {
    	driver2 = BrowserInvoke();
    }

    // Method to initialize the browser driver
    public static WebDriver BrowserInvoke() {
        //ResourceBundle rb = ResourceBundle.getBundle("Config"); // Load properties from Config file
        //String setPropertyText1 = rb.getString("set_Property1");
        //String setPropertyText2 = rb.getString("set_Property2");

        if (threadLocalDriver.get() == null) {
            // Set the ChromeDriver system property
          //  System.setProperty(setPropertyText1, setPropertyText2);

            // Initialize a new WebDriver instance
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().window().maximize();

            // Set the driver in ThreadLocal
            threadLocalDriver.set(driver);
        }
        return threadLocalDriver.get();
    }

    // Getter for ThreadLocal WebDriver
    public static WebDriver getDriver() {
        return threadLocalDriver.get();
    }

    // Method to quit the driver
    public static void quitDriver() {
        if (threadLocalDriver.get() != null) {
            threadLocalDriver.get().quit();
            threadLocalDriver.remove(); // Remove the driver from ThreadLocal
        }
    }

    // Method for handling multiple windows
    public void windowHandle() {
        Set<String> windows = getDriver().getWindowHandles();
        for (String windowHandle : windows) {
            getDriver().switchTo().window(windowHandle);
        }
    }
	
}
