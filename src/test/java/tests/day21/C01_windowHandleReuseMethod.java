package tests.day21;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_windowHandleReuseMethod {

    @Test
    public void test01(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        // reusable methods ile sekmeler arası geçiş

        ReusableMethods.switchToWindow("New Window");

        ReusableMethods.waitFor(3);

        Assert.assertEquals(Driver.getDriver().getTitle(),"New Window");
        // Test Passed
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }
}
