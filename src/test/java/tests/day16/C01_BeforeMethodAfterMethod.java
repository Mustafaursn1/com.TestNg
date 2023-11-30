package tests.day16;


import org.testng.annotations.Test;
import utilities.TestBaseBeforMethodAndAfterMethod;
import utilities.TestBaseBeforeAndAfterClass;

public class C01_BeforeMethodAfterMethod  extends TestBaseBeforeAndAfterClass{
    @Test
    public void amazonTest(){
        driver.get("https://amazon.com");


    }

    @Test
    public void bestBuyTest() {
        driver.get("https://bebstbuy.com");
    }
    @Test
    public void zalondaTets() {
        driver.get("https://www.zalando.com");
    }
}
