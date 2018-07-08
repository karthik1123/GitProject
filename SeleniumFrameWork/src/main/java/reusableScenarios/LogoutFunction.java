package reusableScenarios;
import java.io.IOException;

import resources.Components;

public class LogoutFunction extends InvokeBrowser{

	public void LogoutAction() throws IOException
	{
		Components Cmp= new Components(driver);
		Cmp.Settings().click();
		Cmp.LogoutButton().click();
	}
}
