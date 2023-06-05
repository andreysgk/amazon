import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends Base{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By accountAndListsLocator = By.id("nav-link-accountList");
    private final By signInButtonLocator = By.xpath("//div[@id = 'nav-flyout-ya-signin']//span[@class = 'nav-action-inner']");
    public MainPage hoverOverAccountAndLists(){
        WebElement element = driver.findElement(accountAndListsLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        return this;
    }

    public MainPage signInButton(){
        driver.findElement(signInButtonLocator).click();
        return this;
    }
}
