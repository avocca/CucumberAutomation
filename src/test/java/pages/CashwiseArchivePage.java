package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class CashwiseArchivePage {
    public CashwiseArchivePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id='main']/div/div[4]/table/tbody/tr/td[8]/div/button[2]")
    public WebElement archiveIcon;
    @FindBy(xpath = "(//li)[1]")
    public WebElement salesDropdownButton;

    @FindBy(xpath = "//a[.='Clients']")
    public WebElement clientsButton;












}

