package day16;

import Utilities.TestBase;
import org.testng.annotations.Test;

public class C01_beforeAfterMethod extends TestBase {

    // @Before-AfterMethod notasyonları her test methodundan önce
    // ve sonra çalışır - testNG alfabetik sıraya göre çalışır

    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
    }
    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void test03() {
        driver.get("https://www.github.com");
    }
}
