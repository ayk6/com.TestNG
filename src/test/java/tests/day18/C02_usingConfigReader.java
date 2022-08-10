package tests.day18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LinkedPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_usingConfigReader {
    @Test
    public void test1(){
        LinkedPage linkedPage = new LinkedPage();
        // go to linkedin main page
        Driver.getDriver().get(ConfigReader.getProperty("linkedinUrl"));
        // send wrong e mail
        linkedPage.emailBox.sendKeys(ConfigReader.getProperty("linkedWrongUsername"));
        // send wrong password
        linkedPage.passwordBox.sendKeys(ConfigReader.getProperty("linkedWrongPassword")+ Keys.ENTER);
        // test failure
        Assert.assertTrue(linkedPage.loginFailText.isDisplayed());
        // close driver
        //Driver.closeDriver();

    }
}
