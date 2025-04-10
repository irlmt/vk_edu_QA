package loginPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement emailField = $(By.xpath("//*[@id=\"field_email\"]"));
    private SelenideElement passField = $(By.xpath("//*[@id=\"field_password\"]"));
    private SelenideElement signInButton = $(".//*[@value='Войти в одноклассники']");

    public void enterEmail(String e) {
        emailField.setValue(e);
    }

    public void enterPassword(String p) {
        passField.setValue(p);
    }

    public void clickSignIn() {
        signInButton.click();
    }
}
