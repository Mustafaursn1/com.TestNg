package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeAndAfterClass;

public class C03_HardAssertions extends TestBaseBeforeAndAfterClass {

    @Test
    public void test1() {
        //1-omazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon icerdigini test edin

        String actualTitel = driver.getTitle();
        String expectedTitel = "Amazon";
        Assert.assertTrue(actualTitel.contains(expectedTitel));
        //3-arama kutusnun erisilebilir oldugunu tets edin

        WebElement searcBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Assert.assertTrue(searcBox.isEnabled());
        //4-arama kutusuna Nuella yazip aratin

        searcBox.sendKeys("Nutella", Keys.ENTER);
        //5-arama yapildigina test edin
        WebElement aramaSonucu = driver.
                findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(aramaSonucu.isDisplayed());

        //6-arama sonucunun Nutella icerdigini test edin
        String aramaSonuuText = driver.getTitle();
        String expectetSonuc = "Nutella";
        Assert.assertTrue(aramaSonuuText.contains(expectetSonuc));

    }


//6-arama sonucunun Nutella icerdigini test edin


}


    /*
    1. HARD ASSERT!!!
JUnitte Ögrendigimiz Assertion ile aynidir. TestNG'de soft assertion da oldugundan, ayristirmak icin bu isim kullanilmistir.
JUnitten bildigimiz uzere en çok kullandigimiz 3 cesit hard assertion turu vardir
i. Assert.assertEquals()
ii. Assert.assertTrue()
ili. Assert.assertFalse()
Hard assertion herhangi bir assertion FAILED olursa, test method'nun calismasini durdurur ve kalan kodlari yürütmez (stops execution).
Test case'in nerede FAILED oldugunu hemen anlamak ve kod'a direk mudahale etmek istenirse hard assertion tercih edilebilir.
     */

    /*
    2. SOFT ASSERT (VERIFICATION)!!!
SoftAssert dogrulama (verification) olarak da bilinir.
softAssert kullandigimizda, assert FAILED olsa bile test method'unun istediginiz kismini durdurmaz ve yürütmeye devam eder. If else statement'da oldugu gibi.
Test method'unun istedigimiz bolumde yapilan tum testleri raporlar
Eger assertion'lardan FAILED olan varsa raporlama yapilan satirdan sonrasini calistirmaz.
SoftAssert class'indaki method'lari kullanmak icin kullanabilmemiz için object olusturmamiz gerekir.
     */
