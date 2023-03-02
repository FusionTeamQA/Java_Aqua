package project.skip_trace.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skip_TraceDashBoard {

    public Skip_TraceDashBoard(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[class='sc-dkrFOg iCuqSK']")
    public WebElement buttonBulkSkipTrace;

    @FindBy(css = "input[id='input-file-upload']")
    public WebElement inputFileUpload;

    @FindBy(css = "button[class='sc-dkrFOg iCuqSK']")
    public WebElement buttonMappingData;
    @FindBy(css = "html > body > div > div > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1)")
    public WebElement divFirstName;

    @FindBy(css = "html > body > div > div > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > label:nth-of-type(1) > p")
    public WebElement pFirstName;

    @FindBy(css = "html > body > div > div > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(1)")
    public WebElement divLastName;

    @FindBy(css = "html > body > div > div > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > label:nth-of-type(2) > p")
    public WebElement pLastName;

    @FindBy(css = "html > body > div > div > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(4) > div:nth-of-type(2) > div:nth-of-type(1)")
    public WebElement divAddress;

    @FindBy(css = "html > body > div > div > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(4) > div:nth-of-type(2) > div:nth-of-type(2) > label:nth-of-type(3) > p")
    public WebElement pAddress;

    @FindBy(css = "button[class='sc-dkrFOg iCuqSK']")
    public WebElement buttonPayBulkSkipTrace;

    @FindBy(css = "div[class='styled-final-order__container__title'] h3")
    public WebElement h3Success;

    @FindBy(css = "button[class='sc-dkrFOg iCuqSK']")
    public WebElement buttonBackDashboard;

    @FindBy(css = "button[class='sc-dkrFOg iCuqSK']")
    public WebElement buttonBulkSkipTrace2;

    @FindBy(css = "input[id='search']")
    public WebElement inputSearch;

    @FindBy(css = "div[class='styled-bill__container__title'] h3")
    public WebElement h3BillingInformation;
    
    
    
    










    



}