package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage
{
    WebDriver driver;

    WebDriverWait wait;


    @FindBy(id="gender-male")
    public WebElement maleRadioBtn;

    @FindBy(id="gender-female")
    public WebElement femaleRadioBtn;

    @FindBy(id="FirstName")
    public WebElement firstNameTextbox;

    @FindBy(id="LastName")
    public WebElement lastNameTextbox;

    @FindBy(id="Email")
    public WebElement emailTextbox;

    @FindBy(id="Password")
    public WebElement passwordTextbox;

    @FindBy(id="ConfirmPassword")
    public WebElement confPasswordTextbox;

    @FindBy(id="register-button")
    public WebElement registerBtn;



    @FindBy(name="DateOfBirthDay")
  public WebElement dayDropdown;


    @FindBy(className = "result")
    public WebElement regTextMsg;


   public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }


   public void enterFirstName(String fn)
   {

       firstNameTextbox.sendKeys(fn);
   }

    public void enterLastName(String ln)
    {
       lastNameTextbox.sendKeys(ln);
    }

    public void enterEmail(String em)
    {

       emailTextbox.sendKeys(em);
    }

    public void enterPassword(String pw)
    {
        passwordTextbox.sendKeys(pw);
    }

    public void enterConfPassword(String cpw)
    {
       confPasswordTextbox.sendKeys(cpw);
    }

    public void clickRegisterButton()
    {
        registerBtn.click();
    }

    public void clickMaleRadioButton()
    {
       maleRadioBtn.click();
    }

    public void clickFemaleRadioButton()
    {
       femaleRadioBtn.click();
    }

 public void selectDay(String d)
 {
     Select day = new Select(dayDropdown);
     day.selectByVisibleText(d);
 }

public String getRegistrationText()
{
    return regTextMsg.getText();
}



}
