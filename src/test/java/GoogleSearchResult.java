import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchResult extends Base{

    By displayedResults = By.className("g");

    List<WebElement> availableResults;

    public GoogleSearchResult(WebDriver driver) {
        super(driver);
    }


    public void numberOfLinks(){
        this.availableResults = getElements(displayedResults);
        System.out.println("Number of available Results is: "+availableResults.size());
    }

    public void firstLink(){
        for(int i = 0; i < availableResults.size(); i++){
            if(i==0){
                click(displayedResults);
                break;
            }
        }
    }

}
