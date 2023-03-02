package project.skip_trace.signup_page;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import project.skip_trace.login_page.Skip_TraceLogin;

import java.time.Duration;
import java.util.Locale;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static project.skip_trace.credential.credentials.*;

public class Skip_Trace_SingUpTest {

    private WebDriver driver;
    private Skip_TraceSignUp skipTraceSignUp;

    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +9 в конец

    Faker faker = new Faker(new Locale("en"));
    String fake_firstName = faker.name().firstName();
    String fake_lastName = faker.name().lastName();
    String fake_address = faker.address().streetAddress();
    String fake_city = faker.address().city();
    String fake_state = faker.address().state();
    String fake_zip = faker.address().zipCode();


    @BeforeEach

    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(URL);

        skipTraceSignUp = new Skip_TraceSignUp(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void SignUpPositive() {
        skipTraceSignUp.linkSignUp.click();
        skipTraceSignUp.inputEmail.sendKeys("qwe" + n + NewUser);
        skipTraceSignUp.InputPassword.sendKeys(Password);
        skipTraceSignUp.label.click();
        skipTraceSignUp.buttonSign2.click();
        skipTraceSignUp.inputFirstName.sendKeys(fake_firstName);
        skipTraceSignUp.inputLastName.sendKeys(fake_lastName);
        skipTraceSignUp.inputAddress.sendKeys(fake_address);
        skipTraceSignUp.inputCity.sendKeys(fake_city);
        skipTraceSignUp.inputState.sendKeys(fake_state);
        skipTraceSignUp.inputZipCode.sendKeys(fake_zip);
        skipTraceSignUp.buttonContinue.click();
    }
}
