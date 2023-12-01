package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.TestBaseBeforMethodAndAfterMethod;

public class C03_YoutubeAssertionPractice extends TestBaseBeforMethodAndAfterMethod {
    /*
    1) Bir class olusturun: YoutubeAssertions
    2) hhttps://www.youtube.com adresine gidin
    3) Aasagidaki adlar kullanarak 4 test metodu olusturun ve gerekli testleri yapin

  .titleTest -->sayfa basliginin "YouTube" oldugunu test edin
  .imageTest -->YouTube resminin görüntülendigini (isDisplayed0) test ediniz
  • Search Box in erisilebilir oldugunu test edin (isEnabled)
  .wrongTitleTest--> Sayfa bastiginin "youtube" olmadigini dogrulayin
     */


    @Test
    public void titleTest() {
        getYoutube();
        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);


    }


    @Test
    public void imageTest() {
        getYoutube();
        WebElement imageYoutube = driver.findElement(By.xpath("//*[@id='logo-icon']"));
        Assert.assertTrue(imageYoutube.isDisplayed());


    }

    @Test
    public void searchBoxTest() {
        getYoutube();

        WebElement searchBox=driver.findElement(By.xpath("//*[@id='search-icon-legacy']"));
        Assert.assertTrue(searchBox.isEnabled());


    }

    @Test
    public void wongTitleTest() {
        getYoutube();
        Assert.assertNotEquals(driver.getTitle(),"youtube");



    }

    public void getYoutube() {
        driver.get("https://youtube.com");
    }

}
