import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenGooglePagaTest {
    private SafariDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new SafariDriver();
    }

    @Test
    public void testOpeningGooglePage(){
        //driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Webdriver");
    }

    @Test
    public void testTrelloLinkLogin(){
        driver.navigate().to("https://trello.com");
        driver.findElement(By.linkText("Log in.")).click();
        //driver.findElement(By.xpath("//*[href='/login']"));
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
