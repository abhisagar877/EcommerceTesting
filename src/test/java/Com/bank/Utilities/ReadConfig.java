package Com.bank.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class ReadConfig {

	Properties pro;
	
	public ReadConfig(){
		
		File Src= new File ("./Configuration/config.properties");
		
		try{
			FileInputStream fis=new FileInputStream(Src);
			pro=new Properties() ;
			pro.load(fis);
		}
		catch(Exception e){
			System.out.println("Exception is" + e.getMessage());
		}
		
		
		}

	public String getApplicationURL() {
     String URL=pro.getProperty("baseURL");
     return URL;
	}
	
	public String getuserName() {
	     String username=pro.getProperty("username");
	     return username;
		}
	
	
	
	public String getpassword() {
	     String password=pro.getProperty("password");
	     return password;
		}
	
	public String getChromePath() {
	     String ChromePath=pro.getProperty("ChromePath");
	     return ChromePath;
		}
	
	
	
	
	
	
	
	
	
	
}
