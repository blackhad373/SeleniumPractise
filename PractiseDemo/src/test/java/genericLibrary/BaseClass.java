package genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public WebDriver driver;
public PropertyFile pdata=new PropertyFile();
@BeforeMethod
public void OpenApp()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(pdata.getpropertyData("url"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

@AfterMethod
public void CloseApp() 
{
driver.quit();	
}
}

