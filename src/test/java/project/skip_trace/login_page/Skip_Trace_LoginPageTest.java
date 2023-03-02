package project.skip_trace.login_page;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static project.skip_trace.credential.credentials.*;

public class Skip_Trace_LoginPageTest {

    private WebDriver driver;
    private Skip_TraceLogin skipTraceLogin;

    @BeforeEach

    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(URL);

        skipTraceLogin = new Skip_TraceLogin(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void LoginByAdmin() {
        skipTraceLogin.InputEmail.sendKeys(EmailAdmin);
        skipTraceLogin.InputPassword.sendKeys(Password);
        skipTraceLogin.ButtonLogIn.click();
        String AfterLogin = driver.findElement(By.cssSelector("div[class$='title'] h2")).getText();
        assertTrue(AfterLogin.contains("MENU"));
    }

    @Test
    public void LoginByUser() {
        skipTraceLogin.InputEmail.sendKeys(EmailUser);
        skipTraceLogin.InputPassword.sendKeys(Password);
        skipTraceLogin.ButtonLogIn.click();
        String AfterLogin = driver.findElement(By.cssSelector("div[class$='title'] h2")).getText();
        assertTrue(AfterLogin.contains("MENU"));
    }

    @Test
    public void ResetPassword() {
        skipTraceLogin.linkForgotPassword.click();
        skipTraceLogin.InputEmail.sendKeys(EmailUser);
        skipTraceLogin.buttonGetCode.click();
        String CodeForEmailUser = driver.findElement(By.cssSelector("span[class='text-3']")).getText();
        System.out.printf(EmailUser);
        assertTrue(CodeForEmailUser.contains(EmailUser));
    }
}
