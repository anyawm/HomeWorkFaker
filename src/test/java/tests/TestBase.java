package tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();


    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

            }
}
