package loginPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private SelenideElement emailField = $(By.xpath("//*[@id=\"field_email\"]"));
    private SelenideElement passField = $(By.xpath("//*[@id=\"field_password\"]"));
    private SelenideElement signInButton =  $("[data-l='t,sign_in']");
    private SelenideElement errorLine = $(".login_error");

    public SelenideElement getErrorLine() {
        return errorLine;
    }

    public void enterEmail(String email) {
        emailField.setValue(email);
    }

    public void enterPassword(String password) {
        passField.setValue(password);
    }

    public void clickSignIn() {
        signInButton.click();
    }
}
