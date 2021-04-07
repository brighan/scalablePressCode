import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Base {

    WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver setupDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public void visit(String url){
        driver.get(url);
    }

    public void type(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }

    public void submit(By locator){
        driver.findElement(locator).submit();
    }

}
