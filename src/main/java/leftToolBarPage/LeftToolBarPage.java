package leftToolBarPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LeftToolBarPage {
    private SelenideElement userNameElement = $(".tico.ellip");
    public SelenideElement getUserNameElement(){
        return userNameElement;
    }
}
