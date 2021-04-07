import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class GoogleHomePageTest {

    WebDriver driver;
    GoogleHomePage googleHomePage;
    GoogleSearchResult googleSearchResult;

    @Before
    public void setUp() throws Exception {
        Base chromeDriver = new Base(driver);
        this.driver = chromeDriver.setupDriver();
        googleHomePage = new GoogleHomePage(driver);
        googleSearchResult = new GoogleSearchResult(driver);
        googleSearchResult.visit("https://google.com");
    }

    @Test
    public void test(){
        googleHomePage.setText("cheese");
        googleHomePage.search();
        googleSearchResult.numberOfLinks();
        googleSearchResult.firstLink();
    }

    @After
    public void quit(){
        //driver.quit();
    }

}
