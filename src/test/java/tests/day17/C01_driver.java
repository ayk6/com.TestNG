package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_driver {
    @Test
    public void test1(){
        Driver.getDriver().get("https://www.amazon.com");
        // extends testbase yerine driver classına ait method kullanıldı
        Driver.getDriver().get("https://github.com.");
        // yeni tarayıcı pencere açmadı, açık olanı kullandı
        Driver.closeDriver();
    }
}
