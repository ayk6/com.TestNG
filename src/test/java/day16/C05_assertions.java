package day16;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class C05_assertions extends TestBase {
    @Test
    public void test01(){

        // go to amazon
        driver.get("https://www.amazon.com");
        // test title
        String expTittle="Amazon";
        Assert.assertTrue(driver.getTitle().contains(expTittle));
        // test searchBox
        WebElement srcBox= driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(srcBox.isDisplayed());
        // search maandosi
        srcBox.sendKeys("mandosi"+ Keys.ENTER);
        // test searching
        WebElement resultText= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(resultText.isDisplayed());
        // test resultText contains mandosi
        Assert.assertTrue(resultText.getText().contains("mandosi"));
        driver.close();
        // passed
    }
}
