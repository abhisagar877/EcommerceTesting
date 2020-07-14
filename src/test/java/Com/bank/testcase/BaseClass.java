package Com.bank.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
//Entre Comman details 
	public String baseURL="https://demo.guru99.com/V1/index.php";
	public String username="mngr267410";
	public String password="eqavutA";
	public static WebDriver driver;
	
	
	//Create Setup Method 
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	//create tearDown Method 
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
