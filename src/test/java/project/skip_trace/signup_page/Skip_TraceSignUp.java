package project.skip_trace.signup_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skip_TraceSignUp {

    public Skip_TraceSignUp(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "input[id='email']")
    public WebElement inputEmail;

    @FindBy(css = "input[id='password']")
    public WebElement InputPassword;

    @FindBy(css = "p[class='text-3']")
    public WebElement linkSignUp;

    @FindBy(css = "input[class$='input']")
    public WebElement checkbox;

    @FindBy(css = "button[class='sc-dkrFOg daczxP']")
    public WebElement buttonSign;

    @FindBy(css = "input[id='firstName']")
    public WebElement inputFirstName;

    @FindBy(css = "input[id='lastName']")
    public WebElement inputLastName;

    @FindBy(css = "input[id='address']")
    public WebElement inputAddress;

    @FindBy(css = "input[id='phone']")
    public WebElement inputPhone;

    @FindBy(css = "input[id='city']")
    public WebElement inputCity;

    @FindBy(css = "input[id='state']")
    public WebElement inputState;

    @FindBy(css = "input[id='zipCode']")
    public WebElement inputZipCode;

    @FindBy(css = "button[class='sc-dkrFOg iCuqSK']")
    public WebElement buttonContinue;

    @FindBy(css = "label")
    public WebElement label;

    @FindBy(css = "button[class='sc-dkrFOg iCuqSK']")
    public WebElement buttonSign2;
    
    
    
    
    
    
}