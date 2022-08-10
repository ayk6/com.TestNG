package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GithubPage;
import utilities.Driver;

public class C03_usingPageClass {
    @Test
    public void test1(){
        // go github page
        Driver.getDriver().get("https://www.github.com");
        // write random e-mail
        GithubPage githubPage = new GithubPage();
        githubPage.eMailBox.sendKeys("qwerty"+ Keys.ENTER);
        Driver.closeDriver();
    }
}
