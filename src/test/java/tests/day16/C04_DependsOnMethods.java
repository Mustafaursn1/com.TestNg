package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeAndAfterClass;

public class C04_DependsOnMethods extends TestBaseBeforeAndAfterClass {
    /*
    !!!Bu yöntem bir meth diger meth. bagli olmasini saglamak icin kullanilir.
    Bagli olan sartli test basarisiz olursa  kosul test calismadigi icin digerini calistirmaz.
     */

    @Test
    public void test1() {
        //Amazon ana sayfasina gidiniz
        driver.get("https://amazon.com");

    }

    @Test (dependsOnMethods ="test1" )
    public void test2() {
        //nutella aratiniz
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("nutella", Keys.ENTER);


    }

    @Test (dependsOnMethods = "test2")
    public void test3() {
        //arama sonucunun "amazon" icerdigini test ediniz
        WebElement resultForNutella = driver.
                findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertFalse(resultForNutella.getText().contains("amazon"));

    }
}
