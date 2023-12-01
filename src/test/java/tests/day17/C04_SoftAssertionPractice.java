package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeAndAfterClass;

public class C04_SoftAssertionPractice extends TestBaseBeforeAndAfterClass {


    @Test
    public void test1() {
        /*
             SoftAssert baslangig ve bitis satirlar arasindaki tüm assertion'lari yapI
             bitis olarak belirtmemiz gereken assertAll() metoduyla test metodumuzdaki bütün assertion Lara
             kontrol eder. Failed olon olursa assertion yaptigimiz metodun sonuna yazdigimiz mesaja bize konsolda verir
         */
        SoftAssert softAssert = new SoftAssert();
        //1-omazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon icerdigini test edin

        String actualTitel = driver.getTitle();
        String expectedTitel = "Amazon";

        softAssert.assertTrue(actualTitel.contains(expectedTitel),"Girdiginiz msj icermiyor");
        //-->hata gelirse message consola yazdirilir
        //3-arama kutusnun erisilebilir oldugunu tets edin

        WebElement searcBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        softAssert.assertTrue(searcBox.isEnabled(),"WE erisilmedi");
        //4-arama kutusuna Nuella yazip aratin

        searcBox.sendKeys("Nutella", Keys.ENTER);
        //5-arama yapildigina test edin
        WebElement aramaSonucu = driver.
                findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(aramaSonucu.isDisplayed(),"sonuc WE Görüntülenemedi");

        //6-arama sonucunun Nutella icerdigini test edin
        String aramaSonuuText = driver.getTitle();
        String expectetSonuc = "Nutella";
        softAssert.assertTrue(aramaSonuuText.contains(expectetSonuc),"Nutella icermedi");
        softAssert.assertAll();
        System.out.println("Hata varsa burasi calismaz");


    }
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





