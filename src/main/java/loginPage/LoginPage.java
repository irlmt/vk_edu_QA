package loginPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement emailField = $(By.xpath("//*[@id=\"field_email\"]"));
    private SelenideElement passField = $(By.xpath("//*[@id=\"field_password\"]"));
    private SelenideElement signInButton = $(By.xpath("//*[@id=\"tabpanel-login-8797288942\"]/form/div[4]/input"));

    public void enterEmail(String e) {
        emailField.setValue(e);
    }

    public void enterPassword(String p) {
        passField.setValue(p);
    }

    public void clickSigIn() {
        signInButton.click();
    }
}
