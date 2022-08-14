package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C02_postiveTestReport {
    @Test
    public void positiveLoginTest() {
        // go to bluerentalcars and click login
        Driver.getDriver().get("https://www.bluerentalcars.com");
        WebElement firstLogin = Driver.driver.findElement(
                By.xpath("//a[@class='btn btn-primary btn-sm']"));
        firstLogin.click();

        // send e mail and password
        WebElement eMailTextBox = Driver.driver.findElement(
                By.xpath("//input[@name='email']"));
        eMailTextBox.sendKeys("customer@bluerentalcars.com");

        WebElement passTextBox = Driver.driver.findElement(By.xpath(
                "//input[@name='password']"));
        passTextBox.sendKeys("12345");

        // click login
        WebElement secLogin = Driver.driver.findElement(By.xpath(
                "//button[@type='submit']"));
        secLogin.click();

        // test access
        WebElement userName = Driver.driver.findElement(By.id(
                "dropdown-basic-button"));
        Assert.assertTrue(userName.isDisplayed()); // passed
    }
}
