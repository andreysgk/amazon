import org.openqa.selenium.WebDriver;

public class PageManager {
    public MainPage mainPageTest;
    public SignIn signInTest;
    public PageManager(WebDriver driver){
        mainPageTest = new MainPage(driver);
        signInTest = new SignIn(driver);
    }
}
