package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fileUtiles = new FileUtility();
	public WebDriverUtility utiles = new WebDriverUtility();
	
	@BeforeClass
	public void beforeMethod() throws IOException
	{
		String browserName = fileUtiles.readData("browser");
		if(browserName.equals("firefox"))
			driver = new FirefoxDriver();
		else driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(fileUtiles.readData("url"));
		utiles.WindImplicitlyWait(driver);
	}

	
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
	}
	
}
