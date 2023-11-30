package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeAndAfterClass;

public class C02_Priority extends TestBaseBeforeAndAfterClass {
    /*
    Testleri önceliklendrimek icin @Test(priority =1)
     kullaniriz.sayi yerine - degerler de yazilabilir kücükten büyüge dogru calisir
     hic bir sey yazmadigimiz durumda default olarak 0 alir

     */

    @Test //burayi 0 kabül eder
    public void youtubeTest() {
        driver.get("https://youtube.com");


    }

    @Test(priority = 3)
    public void bestBuyTest() {
        driver.get("https://bebstbuy.com");
    }

    @Test(priority = 2)
    public void zalondaTets() {
        driver.get("https://www.zalando.com");
    }

    @Test(priority = -1)
    public void amazonTets() {
        driver.get("https://www.zalando.com");
    }


}
