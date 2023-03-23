package helixTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelixTest {
	WebDriver driver;

   

    @BeforeTest
    public void setUp() {
        this.driver = new FirefoxDriver();
    }

    @Test
    public void Login_to_the_application_with_valid_credentials_prefix64() {
        this.driver.get("https://www.saucedemo.com/");
        this.driver.findElement(By.id("user-name")).sendKeys(new CharSequence[]{"standard_user"});
        this.driver.findElement(By.id("password")).sendKeys(new CharSequence[]{"secret_sauce"});
        this.driver.findElement(By.id("login-button")).click();
    }

    @AfterTest
    public void tearDown() {
        this.driver.quit();
    }
}
