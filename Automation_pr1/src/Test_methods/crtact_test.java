package Test_methods;

import java.io.IOException;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_objects.Create_acc;


public class crtact_test extends Create_acc {
 


@BeforeTest
  public void browser_launch() throws IOException {
	  launch_browser("https://magento.softwaretestingboard.com/");
  }



@Test
  //creating account in the website by providing all details
  public void Tc_001() {
	
	
	  sendvalues();
	  
  }

	
}
