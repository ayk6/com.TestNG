package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LinkedPage {
    public LinkedPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="session_key")
    public WebElement emailBox;

    @FindBy(id = "session_password")
    public WebElement passwordBox;

    @FindBy(xpath = "//p[@class='alert-content']")
    public WebElement loginFailText;
}
