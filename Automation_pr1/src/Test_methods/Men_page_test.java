package Test_methods;

import org.testng.annotations.Test;

import Page_objects.mens_page;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class Men_page_test extends mens_page {
  @Test
  public void Tc_010() {
	  
	  Verify_men_subtab();
  }
  
  @Test
  public void Tc_011() {
	  
	  men_top_tab();
  }
  
  @Test
  public void Tc_012() {
	  
	  vrfy_item_in_toptab(); 
  }
  
  @Test
  public void Tc_013() {
	  
	  additem_tocart();
  }
  
  @Test
  public void Tc_014() {
	  
	  Verify_cart();
  }
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  
	  launch_browser("https://magento.softwaretestingboard.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  close_browser();
  }

}
