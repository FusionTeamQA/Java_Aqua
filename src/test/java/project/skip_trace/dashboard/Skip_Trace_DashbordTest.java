package project.skip_trace.dashboard;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.skip_trace.login_page.Skip_TraceLogin;
import project.skip_trace.login_page.Skip_Trace_LoginPageTest;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static project.skip_trace.credential.credentials.*;

public class Skip_Trace_DashbordTest {

    private WebDriver driver;
    private Skip_TraceDashBoard skipTraceDashBoard;
    public Skip_TraceLogin skipTraceLogin;
    String FileCVS = "/Users/fusion_tech/Documents/test1/aqua/Java_Aqua/files/TestTable - 123.csv";




    @BeforeEach

    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(URL);

        skipTraceLogin = new Skip_TraceLogin(driver);
        skipTraceDashBoard = new Skip_TraceDashBoard(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void LoadFile() throws InterruptedException {
        skipTraceLogin.InputEmail.sendKeys(EmailUser);
        skipTraceLogin.InputPassword.sendKeys(Password);
        skipTraceLogin.ButtonLogIn.click();
        skipTraceDashBoard.inputSearch.sendKeys("Test");
        WebElement ButtonBulk = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(skipTraceDashBoard.buttonBulkSkipTrace2));
        skipTraceDashBoard.buttonBulkSkipTrace2.click();
        skipTraceDashBoard.inputFileUpload.sendKeys(FileCVS);
        skipTraceDashBoard.buttonMappingData.click();
        String BillingHeader = skipTraceDashBoard.h3BillingInformation.getText();
        assertTrue(BillingHeader.contains("BILLING INFORMATION"));
        skipTraceDashBoard.divFirstName.click();
        skipTraceDashBoard.pFirstName.click();
        skipTraceDashBoard.divLastName.click();
        skipTraceDashBoard.pLastName.click();
        skipTraceDashBoard.divAddress.click();
        skipTraceDashBoard.pAddress.click();
        skipTraceDashBoard.buttonPayBulkSkipTrace.click();
        String success = skipTraceDashBoard.h3Success.getText();
        assertTrue(success.contains("SUCCESS"));
    }

}
