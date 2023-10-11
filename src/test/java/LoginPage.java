import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    @FindBy(name = "username")
    WebElement txtUserName;
    @FindBy(name = "password")
    WebElement txtPass;

    @FindBy(tagName = "submit")
    WebElement btnLogin;

    @FindBy(className = "oxd-userdropdown-name")
    WebElement imglogout;

    @FindBy(className = "oxd-userdropdown-link")
    List<WebElement> subItem;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String username, String password) {
        txtUserName.sendKeys(username);
        txtPass.sendKeys(password);
        btnLogin.click();
    }

    public void doLogout(){
        imglogout.click();
        subItem.get(3).click();
    }

}
