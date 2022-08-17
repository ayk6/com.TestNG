package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseCross;

public class C02_CrossTest extends TestBaseCross

        // Test base corss ve cross driver oluşturuldu
        // utilities

{
    @Test
    public void test01() {
        SoftAssert softAssert = new SoftAssert();
        // go to amazon
        driver.get("https://www.amazon.com");
        // test title
        String expTittle = "Amazon";
        softAssert.assertTrue(driver.getTitle().contains(expTittle),"tittle row");
        // test searchBox
        WebElement srcBox = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(srcBox.isDisplayed(),"searchBox row");
        // search maandosi
        srcBox.sendKeys("mandosi" + Keys.ENTER);
        // test searching
        WebElement resultText = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(resultText.isDisplayed());
        // test resultText contains mandosi
        softAssert.assertTrue(resultText.getText().contains("mandosi"),"resultText row");
        driver.close();

        softAssert.assertAll(); // sonuç raporu almak için

        // soft assert fail olursa sonrasını çalıştırmaz
    }
}
