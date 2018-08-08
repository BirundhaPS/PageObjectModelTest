package Selenium01.PageObjectModel;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class RegisterAccount extends basePage {
	
	pageUI page;
	
  @Test
  public void CustomerRegister() throws Exception { 
	  page=new pageUI(driver);
	  page.AccountCreate();
	  //Assert.assertEquals("Authentication Failed", page.Accountverify());
  }
  
  
  @BeforeMethod
  public void startProcess() {
	  Launch("Chrome","http://automationpractice.com/index.php");
  }

  @AfterMethod
  public void EndProcess() {
  }

}
