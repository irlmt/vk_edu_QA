package loginPageTest;

import com.codeborne.selenide.SelenideElement;
import loginPage.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest {
    @Test
    public void testLogin() {
        open("https://ok.ru/");

        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail("Wrong Login");
        loginPage.enterPassword("Wrong Pasword");
        loginPage.clickSignIn();

        loginPage.getErrorLine().shouldBe(visible);
    }
}
