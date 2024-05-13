package Page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utilities.Base;

public class Checkout_page extends Base{
	
	
	By top_item1 = By.xpath("//*[@id=\'maincontent\']/div[3]/div[1]/div[4]/ol/li[1]/div/div/strong/a");
	By item1_title = By.xpath("//*[@id=\'maincontent\']/div[2]/div/div[2]/div[1]/h1/span");
	By item_1_price = By.xpath("//*[@id=\'product-price-724\']/span");
	By size_button = By.xpath("//*[@id=\'option-label-size-143-item-166\']");
	By colour_btn = By.xpath("//*[@id=\'option-label-color-93-item-50\']");
	By Addtocart = By.xpath("//*[@id=\'product-addtocart-button\']");
	By cartbtn =By.xpath("//a[@class='action showcart']");
	By itemprice_incart =By.xpath("//*[@id=\'mini-cart\']/li/div/div/div[2]/div[1]/span/span");
	
	By checkout_btn = By.xpath("//*[@id=\'top-cart-btn-checkout\']");
	By checkout_pgtitle = By.xpath("//*[@id=\'shipping\']/div[1]");
	By email =By.xpath("//*[@id=\'customer-email\']");
	By frstname = By.xpath("//input[@name='firstname']");  
	By lstname =By.xpath("//input[@name='lastname']");   
	By address = By.xpath("//input[@name='street[0]']");  
	By city = By.xpath("//input[@name='city']");
	By state = By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[5]/div/select/option[32]");
	By pincode = By.xpath("//input[@name='postcode']");
	By country = By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select/option[105]");
	By phn = By.xpath("//input[@name='telephone']");
	By fixed_chkbox = By.xpath("//*[@id=\'checkout-shipping-method-load\']/table/tbody/tr[1]/td[1]/input");
	By tblrate_chkbox =By.xpath("//*[@id=\'checkout-shipping-method-load\']/table/tbody/tr[2]/td[1]/input");
	By state_drpdwn = By.xpath("//*[@id=\'RXOQJTM\']/option[32]");
	By country_drpdwn =By.xpath("//*[@id=\'A4LT96R\']/option[105]");
	By placeorder_btn = By.xpath("//*[@id=\'checkout-payment-method-load\']/div/div/div[2]/div[2]/div[4]/div/button/span");
	By order_msg = By.xpath("//*[@id=\'maincontent\']/div[1]/h1/span");
	By nextbtn = By.xpath("//*[@id=\'shipping-method-buttons-container\']/div/button/span");
	
public void Verify_checkout() {
		
		
		WebElement we12 = driver.findElement(size_button);
		we12.click();
		
		WebElement we5 = driver.findElement(colour_btn);
		we5.click();
		
		WebElement we3 = driver.findElement(Addtocart);
		we3.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement we6 = driver.findElement(cartbtn);
		we6.click();
		
		WebElement we1 = driver.findElement(checkout_btn);
		we1.click();
	
	}

public void verify_chkout_title() {
	
	WebElement we1 = driver.findElement(checkout_pgtitle);
	String s1 =we1.getText();
	String s2 = "Shipping Address";
	Assert.assertEquals(s1, s2);
	
}

public void verify_validemail() {
	
	WebElement we1 = driver.findElement(email);
	we1.sendKeys(read_excel(25,2));
	
}

public void verify_invalidemail() {
	
	WebElement we1 = driver.findElement(email);
	we1.sendKeys(read_excel(26,2));
	
}

public void verify_frstname() {
	
	WebElement we1 = driver.findElement(frstname);
	we1.sendKeys(read_excel(27,2));
	
	
}

public void verify_lastname() {
	
	WebElement we1 = driver.findElement(lstname);
	we1.sendKeys(read_excel(28,2));
	
	
}

public void verify_address() {
	
	WebElement we1 = driver.findElement(address);
	we1.sendKeys(read_excel(29,2));
	
	
}

public void verify_city() {
	
	WebElement we1 = driver.findElement(city);
	we1.sendKeys(read_excel(30,2));
	
	
}

public void verify_country() {
	
	WebElement we1 = driver.findElement(country);
	we1.click();
	
	
}

public void verify_state() {
	
	WebElement we1 = driver.findElement(state);
	we1.click();
	
	
}

public void verify_pincode() {
	
	WebElement we1 = driver.findElement(pincode);
	we1.sendKeys("786453");
	
	
}
public void verify_phn() {
	
	WebElement we1 = driver.findElement(phn);
	we1.sendKeys("6789053425");
	
	
}

public void verify_paymentpge() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement we6 = driver.findElement(nextbtn);
	we6.click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	WebElement we1 = driver.findElement(placeorder_btn);
	we1.click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	WebElement we2 = driver.findElement(order_msg);
	String s1 = we2.getText();
	System.out.println(s1);
	
	
	
}

public void sleep() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}








}
