package tests.day22;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_dataProvider {
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("mandosi"+ Keys.ENTER);
        Assert.assertTrue(amazonPage.resultText.getText().contains("mandosi"));
        Driver.closeDriver();
    }

    @Test(dataProvider = "searchTexts")
    // aranacak kelimeleri liste olarak tutar
    // her veri için ayrı işlem yapılacak
    public void dataProviderTest(String searchTexts){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        // search glass, bottle, cloud, mouse
        amazonPage.searchBox.sendKeys(searchTexts + Keys.ENTER);

        Assert.assertTrue(amazonPage.resultText.getText().contains(searchTexts));
        // 4 tests passed
    }

    @DataProvider
    public static Object[][] searchTexts() {
        return new Object[][]{{"glass"}, {"bottle"}, {"cloud"}, {"mouse"}};
    }
}
