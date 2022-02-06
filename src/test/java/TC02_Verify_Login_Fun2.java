import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TC02_Verify_Login_Fun2 {
    public static void main (String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        logiPageUsingPageFactory pg=new logiPageUsingPageFactory();
        PageFactory.initElements(driver,pg);
        pg.enterusername("Nishita");
        pg.enterpassword("abc123");
        pg.Loginbutton();
    }
}
