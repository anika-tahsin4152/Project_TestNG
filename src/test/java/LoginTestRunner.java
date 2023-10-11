import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestRunner extends Setup {


    @Test
    public void doLogin() {
//        site visit
//    driver.get("https://opensource-demo.orangehrmlive.com");
        LoginPage login = new LoginPage(driver);
        Actions actions = new Actions(driver);
        actions.sendKeys(login.txtUserName, "Admin").perform();
        actions.sendKeys(login.txtPass, "admin123").perform();
        actions.sendKeys(Keys.ENTER).perform();
//        login.doLogin("Admin", "admin123");
        Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-img")).isDisplayed());

//
    }

    @Test(priority = 1)
    public void wrongCreds() {
        LoginPage login = new LoginPage(driver);
        login.doLogin("Admin", "admin124");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
        String actual = driver.findElement(By.className("oxd-text.oxd-text--p")).getText();
        String expected = "Invalid credentials";
    }

    @Test
    public void doLogout() {
        LoginPage login = new LoginPage(driver);
        login.doLogout();
        Assert.assertTrue(driver.findElement(By.className("orangehrm-login-branding")).isDisplayed());
    }
}
