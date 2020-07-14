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
		driver.get("baseUrl");
		//baseurl in loginpage object
		//call the loginpage object and pass driver as a parameter
		Loginpage lp= new Loginpage(driver);
		//Now write down the Steps 
		lp.SetUserName(username);
		lp.SetPassword(password);
		lp.clickSubmit();
		if (driver.getTitle().equals("Guru99bankpage")){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
		}
	}
	

}
