import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
 
public class JavaScriptExecutor{    //Do not change the class name
	
 	//Use the below declarations
 	public static WebDriver driver;
 	public static Object jsfname,jslname, jsuname, jspwd, jsphone, jsemail, jssubmit, jsreset;
 	
 	public WebDriver createDriver()
 	{
 		//Create the driver using the class DriverSetup. Assign it to the variable 'driver' and return it.
 		driver=DriverSetup.getWebDriver();
 		return driver;
 	}
  
  
   public void submitForm(String fname,String lname, String uname, String pwd, String phone, String email) 
   {
 	    JavascriptExecutor jse = ((JavascriptExecutor)driver);
 	    
 	    //Using javascript executor, locate the elements of 'firstname','lastname','username','password'
 	    //'phonenumber','email' and send the received values.
 	    //Submit the form
 	    jse.executeScript("document.getElementsByName('firstname')[0].value='Rahul'");
 	    jse.executeScript("document.getElementsByName('lastname')[0].value='Dravid'");
 	    jse.executeScript("document.getElementsByName('username')[0].value='Rahul'");
 	    jse.executeScript("document.getElementsByName('password')[0].value='rahul@123'");
 	    jse.executeScript("document.getElementsByName('phonenumber')[0].value='6232126711'");
 	    jse.executeScript("document.getElementsByName('email')[0].value='rahultest@gmail.com'");
 	    jse.executeScript("document.getElementById('submit').click();");
         
         
                 
   }
   
   
   public void reset()
   {
 	  JavascriptExecutor jse = ((JavascriptExecutor)driver);
 	  //Using javascript executor, locate the element reset and click it.
 	  jse.executeScript("document.getElementById('reset').click();");
   }
   
   
   public static void main(String[] args) 
   {
 	    JavaScriptExecutor at=new JavaScriptExecutor();
 		at.createDriver();
 		at.reset();
 		//Use this values to submit the form
 		at.submitForm("Rahul","Dravid","Rahul","rahul@123","6232126711","rahultest@gmail.com");
 		
 		 
 	}
   
 }