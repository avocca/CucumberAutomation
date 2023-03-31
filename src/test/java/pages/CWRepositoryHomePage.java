package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CWRepositoryHomePage {


    public  CWRepositoryHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="(//button)[1]")
    public WebElement signInLink;
    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailInputBox;
    @FindBy(xpath ="//input[@name='password']")
    public WebElement passwordInputBox;
    @FindBy(xpath = "(//button[.='Sign in'])[2]")
    public WebElement SigninButton;







    @FindBy(xpath = "(//li)[1]")
    public WebElement salesDropdownButton;
    @FindBy(xpath = "//a[.='Products and services']")
    public WebElement ProdcutAndServicesButton;

    @FindBy(xpath = "//button [1]")
    public WebElement addProductAndServicesButton;
    @FindBy (name = "product_title")
    public WebElement nameInput;
    @FindBy (name = "product_price")
    public WebElement priceInput;
    @FindBy (xpath = "//*[@id=\"mui-component-select-service_type_id\"]")
    public WebElement serviceTypeDropdown;
    @FindBy (xpath = "(//li[@role='option'])[1]")
    public WebElement productOption;
    @FindBy (xpath = "(//li[@role='option'])[2]")
    public WebElement serviceDption;
    @FindBy (xpath = "(//div[@roLe='button'])[5]")
    public WebElement categoryDropdoon;
    @FindBy (xpath = "//*[@id=\"menu-category_id\"]/div[3]/ul/button")
    public WebElement createNewCategoryButton;
    @FindBy (name = "category_title")
    public WebElement titleNameInput;
    @FindBy (name = "category_description")
    public WebElement titleDescriptionInput;
    @FindBy (xpath = "(//button[.='Save'])[2]")
    public WebElement saveButton;
    @FindBy (xpath = "(//Ul/li) [1]")
    public WebElement option0ne;
    @FindBy (name = "product_description")
    public WebElement descriptionInput;
    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/button[2]")
    public WebElement saveButtonFinal;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/table/tbody/tr/td[6]/div/button[1]")
    public WebElement editButton;
    @FindBy(xpath = "//*[@id=\":re:\"]")
    public WebElement nameInput2;
    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/button[2]")
    public WebElement saveButton2;











}
