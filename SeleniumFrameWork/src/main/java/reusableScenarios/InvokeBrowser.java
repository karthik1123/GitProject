package reusableScenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {
	
	public WebDriver driver;
	
	public WebDriver invokeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\GitHubRepository\\.git\\SeleniumFrameWork\\src\\main\\java\\resources\\DataPool.properties");
		prop.load(fis);
		
		String Browser=prop.getProperty("browser");
		System.out.println(Browser);
		
		if (Browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			String URL=prop.getProperty("url");
			driver.get(URL);	
			driver.manage().window().maximize();

			
		}
			else if (Browser.equals("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "c:/geckodriver/geckodriver.exe");
				driver = new FirefoxDriver();
				String URL=prop.getProperty("url");
				driver.get(URL);	
				driver.manage().window().maximize();

			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public WebDriver CloseApplcaition()
	{
		driver.close();
		driver.quit();
		return driver;
	}
}

	