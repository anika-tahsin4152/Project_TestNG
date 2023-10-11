package Pages;

import Config.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage<driver> extends Setup {

    @FindBy(className = "oxd-text")
    List<WebElement> pimList;

    @FindBy(className = "oxd-button")
    List <WebElement> btn;

    @FindBy(className = "oxd-input")
    List <WebElement> formInput;

    @FindBy(className = "oxd-switch-input")
    WebElement switchInput;


    public DashboardPage(WebDriver driver){
        
        PageFactory.initElements(driver,this);
    }

    public void CreateEmp(String firstName, String lastname, String username, String passw) {
        pimList.get(1).click();
        btn.get(2).click();
        formInput.get(1).sendKeys(firstName);
        formInput.get(3).sendKeys(lastname);
        switchInput.click();
        formInput.get(5).sendKeys(username);
        formInput.get(6).sendKeys(passw);
        formInput.get(7).sendKeys(passw);
        btn.get(1).click();
//        formInput.get(8).sendKeys(firstName);


    }
}
