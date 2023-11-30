package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBaseBeforMethodAndAfterMethod {

    protected WebDriver driver;
      /*
          TestNG de @Before ve @After notosyanlari yerine @BeforMethod ve @AfterMethod kullanilir
          Calisma prensipleri JUnit deki Before ve After ile aynidir.
       */

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod//Testng den gelir
    public void tearDown() {
        //driver.quit();
        if (driver != null) {
            driver.quit();
        }
    }

}
