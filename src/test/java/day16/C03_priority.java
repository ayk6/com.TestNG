package day16;

import Utilities.TestBase;
import org.testng.annotations.Test;

public class C03_priority extends TestBase {
    // testNG alfabetik çalışır, farklı sıralama için öncelik tanımlaması
    // yapılabilir - priority küükten büyüğe çalışır,
    // değer atanmayan priority default 0 alır

    @Test (priority = 5) // son
    public void test01() {
        driver.get("https://www.amazon.com");
    }
    @Test (priority = -4) // ilk
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }
    @Test // default 0  // iki
    public void test03() {
        driver.get("https://www.github.com");
    }
}
