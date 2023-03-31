package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;

public class CashwiseMainPage {
    public CashwiseMainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//li[.='Reports']")
    public WebElement reportsButton;

    @FindBy (xpath = "//*[@id=\"mui-component-select-categoryId\"]")
    public WebElement allCategoriesButton;

    @FindBy (xpath = "//ul/li")
    public List<WebElement> allCategoriesOptions;















}
