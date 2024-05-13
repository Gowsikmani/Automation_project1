package Test_methods;

import org.testng.annotations.Test;
import Page_objects.Homepage;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.testng.annotations.AfterMethod;

public class Home_page_Test extends Homepage {
  @Test
  public void Tc_005() {
	  
	  vrfy_men_tab();
  }
  
  @Test
  public void Tc_006() {
	  
	  vrfy_women_tab();
  }
  
  @Test
  public void Tc_007() {
	  
	  vrfy_Whatsnew_tab();
  }
  
  @Test
  public void Tc_008() {
	  
	  Verify_empty_cart();
  }
  
  @Test
  public void Tc_009() {
	  
	  Searchbox();
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
