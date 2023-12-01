package tests.day17;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeAndAfterClass;

public class C01_DepensOnMethods extends TestBaseBeforeAndAfterClass {

    @Test
    public void test1() {
        driver.get("https://wamazonf.com");


    }
    @Test(dependsOnMethods = "test1")
    public void test2() {
        driver.get("https://facebook.com");


    }
    @Test(dependsOnMethods = "test2")
    public void test3() {
        driver.get("https://bestbuy.com");


    }
    @Test(dependsOnMethods = "test3")
    public void test4() {
        driver.get("https://www.postbank.com");


    }
    @Test
    public void test5() {
        driver.get("https://www.youtube.com");


    }
}
