package Com.bank.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
//create object class 
	//First initate Webdriver opeject
	WebDriver Idriver;
	//then write to constructore
	//make constructre to public so easy to find outside
	 public Loginpage(WebDriver rdriver)
	{
		//iniated the local driver to remote driver
		//Specify the pageFactory
		Idriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//identifed the elemnets which present in login page 
	
	@FindBy(name="email")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@id='content']/div/div[2]/div/form/input")
	WebElement btnLogin;

	
	///Now create action method for 3 elements 
	public void SetUserName(String uname){
		txtUserName.sendKeys(uname);
	}
	
	public void SetPassword(String pwd){
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit(){
		btnLogin.click(); 
	}
	
}
 