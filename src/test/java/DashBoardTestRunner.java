import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashBoardTestRunner extends Setup {

    @BeforeTest
    public void Login() {
        LoginPage login = new LoginPage(driver);
        login.doLogin("Admin", "1234");
    }

    @Test
    public void CreateEmp() {
        DashboardPage dash = new DashboardPage(driver);
        dash.CreateEmp("Anika", "hridi", "anhr2", "1234");
    }
}
