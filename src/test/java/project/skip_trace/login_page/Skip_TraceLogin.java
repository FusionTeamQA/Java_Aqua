package project.skip_trace.login_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skip_TraceLogin {

    public Skip_TraceLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "input[id='email']")
    public WebElement InputEmail;

    @FindBy(css = "input[id='password']")
    public WebElement InputPassword;

    @FindBy(css = "button[class='sc-dkrFOg iCuqSK']")
    public WebElement ButtonLogIn;

    @FindBy(css = "a[class*='styled-login-page']")
    public WebElement linkForgotPassword;

    @FindBy(css = "button[class='sc-dkrFOg iCuqSK']")
    public WebElement buttonGetCode;
}