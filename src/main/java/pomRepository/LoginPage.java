package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "username")
	private WebElement userNameTextField;
	public WebElement getuserNameTextField()
	{
		return userNameTextField;
	}
	
	@FindBy(name = "password")
	private WebElement passwordTestField;
	public WebElement getpasswordTestField()
	{
		return passwordTestField;
	}
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginButton;
	public WebElement getloginButton()
	{
		return loginButton;
	}
}
