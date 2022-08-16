package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBaseReport;

public class C02_postiveTestReport extends TestBaseReport {
    @Test
    public void positiveLoginTest() {
        extentTest = extentReports.createTest(
                "positive login","valid username and passw");
        // go to bluerentalcars and click login
        Driver.getDriver().get("https://www.bluerentalcars.com");
        extentTest.info("homepage succesfully opened");
        WebElement firstLogin = Driver.driver.findElement(
                By.xpath("//a[@class='btn btn-primary btn-sm']"));
        firstLogin.click();
        extentTest.info("login button clicked");

        // send e mail and password
        WebElement eMailTextBox = Driver.driver.findElement(
                By.xpath("//input[@name='email']"));
        eMailTextBox.sendKeys("customer@bluerentalcars.com");
        extentTest.info("valid email");

        WebElement passTextBox = Driver.driver.findElement(By.xpath(
                "//input[@name='password']"));
        passTextBox.sendKeys("123456");
        extentTest.info("valid password");

        // click login
        WebElement secLogin = Driver.driver.findElement(By.xpath(
                "//button[@type='submit']"));
        secLogin.click();
        extentTest.info("second login clicked");

        // test access
        WebElement userName = Driver.driver.findElement(By.id(
                "dropdown-basic-button"));
        Assert.assertTrue(userName.isDisplayed()); // passed
        extentTest.pass("succesful login");
        Driver.closeDriver();
    }
}
