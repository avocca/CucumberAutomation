package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CashwiseSignUpSuccessfullyPage {
    public CashwiseSignUpSuccessfullyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//button)[2]")
    public WebElement signUpbutton;

    @FindBy(id=":r3:")
    public WebElement emailInputBox;

    @FindBy(id=":r4:")
    public WebElement passwordInputBox;

    @FindBy(id=":r5:")
    public WebElement confirmationPassword;

    @FindBy (xpath = "(//button)[7]")
    public WebElement continueButton;

    @FindBy(id=":r6:")
    public WebElement nameBtn;

    @FindBy(id=":r7:")
    public WebElement surnameBtn;

    @FindBy(id=":r8:")
    public WebElement nameOfBussiness;

    @FindBy(xpath ="(//div)[96]")
    public WebElement AreOfBussiness;

    @FindBy(xpath = "(//li)[3]")
    public WebElement selectBussinessType;

    @FindBy(id=":r9:")
    public WebElement address;

    @FindBy(xpath = "(//div)[103]")
    public WebElement currencyChoose;

    @FindBy(xpath = "(//li)[2]")
    public WebElement usdBtn;

    @FindBy(xpath = "(//button)[5]")
    public  WebElement sighUpFinal;













}
