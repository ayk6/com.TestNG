package tests.day18;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_configReader {
    @Test
    public void test1(){
        Driver.getDriver().get("amazonUrl");
        Driver.getDriver().get("githubUrl");
    }
}
