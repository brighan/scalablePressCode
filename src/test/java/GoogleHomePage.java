import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends Base{

    By searchBar = By.name("q");
    By searchBtn = By.name("btnK");

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public void setText(String text){
        type(searchBar,text);
    }

    public void search(){
        submit(searchBtn);
    }
}
