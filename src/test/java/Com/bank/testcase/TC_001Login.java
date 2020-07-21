package Com.bank.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.bank.pageObject.Loginpage;

//extedns baseclass
public class TC_001Login  extends BaseClass{
	//create login method 
	
	@Test
	public void logintest(){
		//open url
		
		
		driver.get(baseURL);
		logger.info("URl is open");
		//baseurl in loginpage object
		//call the loginpage object and pass driver as a parameter
		Loginpage lp= new Loginpage(driver);
		//Now write down the Steps 
		lp.SetUserName(username);
		logger.info("enter user name");
		lp.SetPassword(password);
		
		logger.info("enter password");
		lp.clickSubmit();
		
		logger.info("Submited");
		
		if (driver.getTitle().equals("theShpoingWorld")){
			Assert.assertTrue(true);
			logger.info("testcase passed");
		}
		else{
			
			Assert.assertTrue(false);
			logger.info("test failed");
		}
	}
	

}
