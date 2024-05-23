package base;

import java.io.File;
import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utils.Routes;

public class BaseTest {

    public static WebDriver driver;
    private ExtentReports extent;
    public static Logger log;

    @BeforeTest
    public void beforeTest() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(
        System.getProperty("user.dir") + File.separator + "reports" + File.separator + "PageFactory");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Functionality Test");
    }

    @BeforeMethod
    @Parameters("endpoint")
    public void startUp(@Optional String endpoint) {
    	log= LogManager.getLogger(BaseTest.class);
//        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get(Routes.base_url + endpoint);
//        driver.get(Routes.Sortable);
        log.info("Logged in to the website");
        driver.manage().window().maximize();// Concatenate base URL with endpoint
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
            log.info("Quitting driver");
        }
    }

    @AfterTest
    public void tearEnd() {
        extent.flush();
    }
}