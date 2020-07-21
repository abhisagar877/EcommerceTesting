package Com.bank.testcase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Com.bank.Utilities.ReadConfig;
import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class BaseClass {
//Entre Comman details 
	ReadConfig readconfig= new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getuserName();
	public String password=readconfig.getpassword();
	public static WebDriver driver;
	
	public static Logger logger;
	//Create Setup Method 
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver=new ChromeDriver();
		logger=Logger.getLogger("EndToEndTesting");
		PropertyConfigurator.configure("log4j.properties");		
	}
	
	//create tearDown Method 
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
