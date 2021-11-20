package pom;

import baseAPI.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Login extends Base {

    public Login() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "div > nav > div.rd-navbar-inner > div > a")
    public WebElement loginButtonFromHP;

    @FindBy (css = "#ui > div > div > form > div > div:nth-child(1) > div > input[type=text]")
    public WebElement emailInput;

    @FindBy (css = "#ui > div > div > form > div > div:nth-child(2) > div > input[type=password]")
    public WebElement passwordInput;

    @FindBy (css = "#ui > div > div > form > div > div.ui.fluid.large.blue.submit.button")
    public WebElement loginButtonFromLP;

    @FindBy (css = "#ui > div > div > form > div > div.ui.negative.message > div")
    public WebElement errorMsg;

    public void clickOnLoginButtonHP() {
        clickOnElement(loginButtonFromHP);

    }

    public void enterEmailAddress(String emailAddress) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sendKeysToElement(emailInput, emailAddress);
    }

    public void enterPassword(String password) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sendKeysToElement(passwordInput, password);
    }

    public void clickOnLoginButtonLP() {
        clickOnElement(loginButtonFromLP);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public String getErrorMsg() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return getTextByWebElement(errorMsg);
    }

}
