import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorizationTest extends BaseTest{
    @Test
    public void successfulAuthorization(){
        pageManager.mainPageTest.hoverOverAccountAndLists()
                .signInButton();
        pageManager.signInTest.emailField()
                .continueButton()
                .passwordField()
                .signInButton();
        Assertions.assertEquals("Amazon.com. Spend less. Smile more.", pageManager.signInTest.getTitle());
    }
}
