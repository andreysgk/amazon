import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn extends Base{
    public SignIn(WebDriver driver) {
        super(driver);
    }
    private final By emailFieldLocator = By.xpath("//input[@name='email']");
    private final By continueLocator = By.id("continue");
    private final By passwordFieldLocator = By.xpath("//input[@type='password']");
    private final By signInLocatorLocator = By.id("signInSubmit");

    public SignIn emailField(){
        driver.findElement(emailFieldLocator).sendKeys("kiril1batsilev@mail.ru");
        return this;
    }

    public SignIn continueButton(){
        driver.findElement(continueLocator).click();
        return this;
    }

    public SignIn passwordField(){
        driver.findElement(passwordFieldLocator).sendKeys("andreySgk22");
        return this;
    }

    public SignIn signInButton(){
        driver.findElement(signInLocatorLocator).click();
        return this;
    }

    public String getTitle(){
        return driver.getTitle();
    }



}
