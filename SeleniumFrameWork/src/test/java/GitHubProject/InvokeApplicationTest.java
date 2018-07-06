package GitHubProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableScenarios.LoginFunction;
import reusableScenarios.InvokeBrowser;

public class InvokeApplicationTest {
	public WebDriver driver;
	@Test
	public void OpenApplication() throws IOException
	{
	
	InvokeBrowser OpenApplication = new InvokeBrowser();
	OpenApplication.invokeDriver();
	
	LoginFunction Login = new LoginFunction(driver);	
	Login.LoginAction();
		
	}
	

}
