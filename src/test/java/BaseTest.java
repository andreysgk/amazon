import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    PageManager pageManager;
    @BeforeAll
    public static void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\raphi\\browsers\\chromedriver.exe");
    }
    @BeforeEach
    public void urlMain(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com/");
        Cookie auto = new Cookie("session-id","141-1007303-3750925");
        driver.manage().addCookie(auto);
        driver.navigate().refresh();
        driver.manage().window().maximize();
        pageManager = new PageManager(driver);
    }


}
