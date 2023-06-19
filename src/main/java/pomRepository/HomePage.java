package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root has-submenu compact')]")
	private WebElement orderOption;
	public WebElement getorderOption()
	{
		return orderOption;
	}
	
	@FindBy(xpath = "//span[text()='Orders']")
	private WebElement orderButton;
	public WebElement getorderButton()
	{
		return orderButton;
	}
	
	@FindBy(xpath = "//button[text()='Add Bulk Orders']")
	private WebElement addBulkOrdersOption;
	public WebElement getaddBulkOrdersOption()
	{
		return addBulkOrdersOption;
	}
}
