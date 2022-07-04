package day16;

import Utilities.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C02_beforeAfterClass extends TestBase {
    // @Before-AfterClass notasyonları jUnit'te static olmak zorunda
    // testNG'de static olmak zorunda değil

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("before class works");

    }@AfterClass
    public void afterClassMethod(){
        System.out.println("after class works");
    }

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
