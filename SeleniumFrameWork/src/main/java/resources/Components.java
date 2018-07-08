package resources;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableScenarios.InvokeBrowser;

public class Components extends InvokeBrowser{
	
	By LoginUsrnme= By.xpath("//input[@id='email']");
	By LoginPsw= By.xpath("//input[@id='pass']");
	By Submit= By.xpath("//input[@type='submit']");
	By Accountsettings = By.xpath("//div[@id='userNavigationLabel']");
	By Logout = By.xpath("//span[contains(text(), 'Log Out')]");
	
	//div[contains(text(), "Account Settings")]
	
	public Components(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public WebElement LoginUsrId()
	{
		return driver.findElement(LoginUsrnme);
	}
	public WebElement LoginPswd()
	{
		return driver.findElement(LoginPsw);
	}
	public WebElement SubmitButton()
	{
		return driver.findElement(Submit);
	}
	public WebElement Settings()
	{
		return driver.findElement(Accountsettings);
	}
	public WebElement LogoutButton()
	{
		return driver.findElement(Logout);
	}
	
	
}
