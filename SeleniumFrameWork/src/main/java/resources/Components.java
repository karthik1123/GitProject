package resources;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Components {
	
	public WebDriver driver;

	By LoginUsrnme= By.xpath("//input[@id='email']");
	By LoginPsw= By.xpath("//input[@id='pass']");
	By Submit= By.xpath("//input[@type='submit']");

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
	
	
}
