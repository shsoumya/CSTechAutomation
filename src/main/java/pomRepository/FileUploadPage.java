package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {

	public WebDriver driver;
	public FileUploadPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[contains(@class,'MuiOutlinedInput-input')]")
	private WebElement fileUploadOption;
	public WebElement getfileUploadOption()
	{
		return fileUploadOption;
	}
	
	@FindBy(xpath = "//button[text()='Import']")
	private WebElement importButton;
	public WebElement getimportButton()
	{
		return importButton;
	}
	
	@FindBy(xpath = "//button[text()='Validate Data']")
	private WebElement validateDataButton;
	public WebElement getvalidateDataButton()
	{
		return validateDataButton;
	}
}
