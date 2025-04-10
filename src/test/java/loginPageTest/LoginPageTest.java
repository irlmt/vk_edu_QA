package loginPageTest;

import com.codeborne.selenide.SelenideElement;
import loginPage.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest {
    @Test
    public void testLogin() {
        open("https://ok.ru/");

        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail("Wrong Login");
        loginPage.enterPassword("Wrong Pasword");
        loginPage.clickSignIn();

        SelenideElement errorLine = $("//div[@class=\"input-e login_error\"");
        errorLine.shouldBe(visible);
    }
}
