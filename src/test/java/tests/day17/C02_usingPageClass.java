package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_usingPageClass {
    @Test
    public void test1(){
        // go to amazon
        Driver.getDriver().get("https://www.amazon.com");
        // search mandosi
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("mandosi"+ Keys.ENTER);
        Assert.assertTrue(amazonPage.resultText.getText().contains("mandosi"));
    }
}
