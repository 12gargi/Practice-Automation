package base;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Routes;

public class BaseTest {
    public static WebDriver driver;
    private ExtentReports extent;

    @BeforeMethod
    @Parameters({"browser", "endpoint"})
    public void setUpMethod(@Optional("chrome") String browser, @Optional String endpoint) {
        try {
            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
                System.out.println("Chrome driver launched");
            } else if (browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                // EdgeOptions edgeOptions = new EdgeOptions(); // Not required for Chrome
                // edgeOptions.addArguments("--headless"); // Not required for Chrome
                // driver = new EdgeDriver(edgeOptions); // Not required for Chrome
                // System.out.println("Edge driver launched"); // Not required for Chrome
            }
        } catch (Exception e) {
            System.out.println("Failed to create WebDriver session: " + e.getMessage());
            // Stop test execution if WebDriver initialization fails
            throw new WebDriverException("WebDriver initialization failed: " + e.getMessage());
        }

        if (driver != null) {
            driver.get(Routes.base_url + endpoint);
            driver.manage().window().maximize(); // Maximizing window
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Setting implicit wait
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
