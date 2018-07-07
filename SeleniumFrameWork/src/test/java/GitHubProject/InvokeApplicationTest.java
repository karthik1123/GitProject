package GitHubProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableScenarios.LoginFunction;


public class InvokeApplicationTest {
	public static WebDriver driver;
	
	@Test
	public void OpenApplication() throws IOException
	{
			
	LoginFunction Login = new LoginFunction();	
	Login.LoginAction();
		
	}
	

}
