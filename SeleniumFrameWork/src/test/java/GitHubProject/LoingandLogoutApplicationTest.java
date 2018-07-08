package GitHubProject;
import java.io.IOException;
import org.testng.annotations.Test;
import reusableScenarios.InvokeBrowser;
import reusableScenarios.LoginFunction;
import reusableScenarios.LogoutFunction;


public class LoingandLogoutApplicationTest {
		
	@Test
	public void OpenApplication() throws IOException
	{
			
	LoginFunction Login = new LoginFunction();	
	Login.invokeDriver();
	Login.LoginAction();
	
	}
	@Test
	public void LogoutApplication() throws IOException
	{
	LogoutFunction Logout = new LogoutFunction();
	Logout.LogoutAction();
	InvokeBrowser CloseApp = new InvokeBrowser();	
	CloseApp.CloseApplcaition();
	}

}
