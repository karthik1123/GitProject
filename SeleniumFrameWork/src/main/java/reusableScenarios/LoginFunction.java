package reusableScenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import resources.Components;

public class LoginFunction {

	public WebDriver driver;
	
	public LoginFunction(WebDriver driver) {
		this.driver = driver;
	}
	
public void LoginAction() throws IOException
{
	
		Properties prop = new Properties();
	FileInputStream fis= new FileInputStream("C:\\GitHubRepository\\.git\\SeleniumFrameWork\\src\\main\\java\\resources\\DataPool.properties");
	prop.load(fis);
	
	Components Cmp= new Components(driver);
	//Cmp.LoginUsrId().sendKeys("karthik.agileqa@gmail.com");
	Cmp.LoginUsrId().sendKeys(prop.getProperty("usrnme"));
    //Cmp.LoginPswd().sendKeys("plyboy@1123");
    Cmp.LoginPswd().sendKeys(prop.getProperty("pswd"));
	Cmp.SubmitButton().click();	
	System.out.println(driver.getTitle());

}
}
