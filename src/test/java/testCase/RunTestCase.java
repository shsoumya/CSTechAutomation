package testCase;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomRepository.FileUploadPage;
import pomRepository.HomePage;
import pomRepository.LoginPage;

public class RunTestCase extends BaseClass {
	LoginPage loginPage;
	HomePage homePage;
	FileUploadPage fileUpload;
	StringSelection stringSelection;
	Robot robot;
	@Test(priority = 1)
	public void login() throws IOException
	{
	loginPage = new LoginPage(driver);
	loginPage.getuserNameTextField().sendKeys(fileUtiles.readData("username"));
	loginPage.getpasswordTestField().sendKeys(fileUtiles.readData("password"));
	loginPage.getloginButton().click();
	
	}
	
	@Test(priority = 2)
	public void homePage() throws Throwable
	{
		homePage = new HomePage(driver);
		homePage.getorderOption().click();
		homePage.getorderButton().click();
		homePage.getaddBulkOrdersOption().click();
		fileUpload = new FileUploadPage(driver);
		File file = new File("./commonData/demo-data.xlsx");
		String path = file.getAbsolutePath();
		fileUpload.getfileUploadOption().sendKeys(path);
		fileUpload.getimportButton().click();
		fileUpload.getvalidateDataButton().click();
		Thread.sleep(3000);
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File("./errorshots/" + LocalDateTime.now().toString().replace(':', '-') + "validata.png"));
	}
}
