package loginPageTest;

import leftToolBarPage.LeftToolBarPage;
import loginPage.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginPageTest {
    @AfterEach
    void clearCookies() {
        clearBrowserCookies();
        clearBrowserLocalStorage();
        open("about:blank");
    }
    @Test
    public void testLoginError() {
        open("https://ok.ru/");

        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail("Wrong Login");
        loginPage.enterPassword("Wrong Pasword");
        loginPage.clickSignIn();

        loginPage.getErrorLine().shouldBe(visible);
    }
    @Test
    public void testSuccessfulLogin(){
        open("https://ok.ru/");
        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail("technopol35");
        loginPage.enterPassword("technopolisPassword");
        loginPage.clickSignIn();

        LeftToolBarPage leftToolBarPage = new LeftToolBarPage();
        leftToolBarPage.getUserNameElement().shouldBe(visible);
    }
}
