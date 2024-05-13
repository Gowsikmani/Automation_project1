package Test_methods;

import org.testng.annotations.Test;

import Page_objects.Checkout_page;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class Checkoutpage_Test extends Checkout_page {
  @Test
  public void Tc_015() {
	  Verify_checkout();
	  sleep();
	  verify_chkout_title();
	  
  }
  
  @Test
  public void Tc_016() {
	  
	  Verify_checkout();
	  sleep();
	  verify_validemail();
  }
  
  @Test
  public void Tc_017() {
	  
	  Verify_checkout();
	  sleep();
	  verify_invalidemail();
  }
  
  @Test
  public void Tc_018() {
	  
	  Verify_checkout();
	  sleep();
	  verify_frstname();
  }
  
  @Test
  public void Tc_019() {
	  
	  Verify_checkout();
	  sleep();
	  verify_lastname();
  }
  
  @Test
  public void Tc_020() {
	  
	  Verify_checkout();
	  sleep();
	  verify_address();
	  
  }
  
  @Test
  public void Tc_021() {
	  
	  Verify_checkout();
	  sleep();
	  verify_city();
  }
  
  @Test
  public void Tc_022() {
	  
	  Verify_checkout();
	  sleep();
	  verify_country();
  }
  
  @Test
  public void Tc_023() {
	  Verify_checkout();
	  sleep();
	  verify_state();
  }
  
  @Test
  public void Tc_024() {
	  Verify_checkout();
	  sleep();
	  verify_pincode();
  }
  
  @Test
  public void Tc_025() {
	  Verify_checkout();
	  sleep();
	  verify_phn();
  }
  
  @Test
  public void Tc_026() {
	  Verify_checkout();
	  sleep();
	  verify_validemail();
	  sleep();
	  verify_frstname();
	  sleep();
	  verify_lastname();
	  sleep();
	  verify_address();
	  sleep();
	  verify_city();
	  sleep();
	  verify_country();
	  sleep();
	  verify_state();
	  sleep();
	  verify_pincode();
	  sleep();
	  verify_phn();
	  sleep();
	  verify_paymentpge();
  }
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  launch_browser("https://magento.softwaretestingboard.com/cassius-sparring-tank.html");
  }

  @AfterMethod
  public void afterMethod() {
	  close_browser();
  }

}
