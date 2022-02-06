import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_Verify_Login_Fun {
    public static void main (String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        LoginPage lg = new LoginPage(driver);
        driver.get("https://demo.opencart.com/index.php?route=account/login");

        lg.Enterusername("Nishita");
        lg.Enterpassword("abc123");
        lg.Loginbutton();
    }
}