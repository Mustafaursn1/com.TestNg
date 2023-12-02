package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeAndAfterClass;

import java.util.List;

public class C05_SoftAssertQ1 extends TestBaseBeforeAndAfterClass {

    /*
    Soft Assert Class Work
Yeni bir Class Olusturun : C03_SoftAssert
"http://zero.webappsecurity.com/" Adresine gidin
2. Sign in butonuna basin
3. Login kutusuna "username" yazin
4. Password kutusuna "p assword" yazin
5. Sign in tusuna basin
6. Online banking menusu icinde Pay Bills sayfasina gidin
7. "Purchase Foreign Currency" tusuna basin
8. "Currency" drop down menusunden Eurozone'u secin
9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone)", "Eurozone (euro)",
"Great Britain (pound)","Hong Kong: (dollar)","Japan (yen)","Mexico (peso)", "Norway (krone)","New Zealand (dollar)".
"Sweden (krona)". "Singapore (dollar)". "Thailand (baht)"
     */

    @Test
    public void test1(){

        driver.get("https://the-internet.herokuapp.com/");
        WebElement dropDownButton= driver.findElement(By.xpath("//*[text()='Dropdown']"));
        dropDownButton.click();

        WebElement dropDown=driver.findElement(By.xpath("//*[@id='dropdown']"));

        Select select=new Select(dropDown);
        List<WebElement> dropDownList=select.getOptions();
        System.out.println(dropDownList.size());

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(dropDownList.get(0).isDisplayed());
        softAssert.assertAll();





    }





}
