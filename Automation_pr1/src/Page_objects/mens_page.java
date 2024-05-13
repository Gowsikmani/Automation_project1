package Page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utilities.Base;

public class mens_page extends Base {
	
	By men_tab = By.xpath("//*[@id=\'ui-id-5\']");
	By tops = By.xpath("//*[@id=\'narrow-by-list2\']/dd/ol/li[1]/a");
	By tops_count = By.xpath("//*[@id=\'narrow-by-list2\']/dd/ol/li[1]/span");
	By top_pgtitle = By.xpath("//*[@id=\'page-title-heading\']/span");
	By Bottoms = By.xpath("//*[@id=\'narrow-by-list2\']/dd/ol/li[2]/a");
	By Bottoms_count =By.xpath("//*[@id=\'narrow-by-list2\']/dd/ol/li[2]/span");
	
	By item1title =By.xpath("//*[@id=\'maincontent\']/div[3]/div[1]/div[4]/ol/li[1]/div/div/strong");
	By top_item1 = By.xpath("//*[@id=\'maincontent\']/div[3]/div[1]/div[4]/ol/li[1]/div/div/strong/a");
	By item1_title = By.xpath("//*[@id=\'maincontent\']/div[2]/div/div[2]/div[1]/h1/span");
	By item_1_price = By.xpath("//*[@id=\'product-price-724\']/span");
	By size_button = By.xpath("//*[@id=\'option-label-size-143-item-166\']");
	By colour_btn = By.xpath("//*[@id=\'option-label-color-93-item-50\']");
	By Addtocart = By.xpath("//*[@id=\'product-addtocart-button\']");
	By cartbtn =By.xpath("//a[@class='action showcart']");
	By itemprice_incart =By.xpath("//*[@id=\'mini-cart\']/li/div/div/div[2]/div[1]/span/span");
	
	public void Verify_men_subtab() {
		
		WebElement we9 = driver.findElement(men_tab);
		we9.click();
		
		WebElement we1 = driver.findElement(tops_count);
		String x=we1.getText();
		String y = "48";
		Assert.assertEquals(x, y);
		
		WebElement we2 = driver.findElement(Bottoms_count);
		String a=we2.getText();
		String b = "24";
		Assert.assertEquals(a, b);
	}
	
	public void men_top_tab() {
		
		WebElement we9 = driver.findElement(men_tab);
		we9.click();
		
		WebElement we1 = driver.findElement(tops);
		we1.click();
		WebElement we2 = driver.findElement(top_pgtitle);
		String a=we2.getText();
		String b = "Tops";
		Assert.assertEquals(a, b);
		
		
	}
	
	public void vrfy_item_in_toptab() {
		
		WebElement we9 = driver.findElement(men_tab);
		we9.click();
		
		WebElement we10 = driver.findElement(tops);
		we10.click();
		WebElement we1 = driver.findElement(item1title);
		String s1 =we1.getText();
		WebElement we2 = driver.findElement(size_button);
		we2.click();
		
		WebElement we4 = driver.findElement(item1title);
		String s2 =we4.getText(); 
		Assert.assertEquals(s1, s2);
		
		
	}
	
	public void additem_tocart() {
		
		WebElement we9 = driver.findElement(men_tab);
		we9.click();
		
		WebElement we10 = driver.findElement(tops);
		we10.click();
		
		
		WebElement we2 = driver.findElement(top_item1);
		we2.click();
		
		WebElement we12 = driver.findElement(size_button);
		we12.click();
		
		WebElement we5 = driver.findElement(colour_btn);
		we5.click();
		
		WebElement we3 = driver.findElement(Addtocart);
		we3.click();
		
		
	}
	
	public void Verify_cart() {
		
		WebElement we9 = driver.findElement(men_tab);
		we9.click();
		
		WebElement we10 = driver.findElement(tops);
		we10.click();
		
		WebElement we1 = driver.findElement(item_1_price);
		String s1 =we1.getText();
		WebElement we2 = driver.findElement(top_item1);
		we2.click();
		
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
	
		WebElement we4 = driver.findElement(itemprice_incart);
		String s2 =we4.getText(); 
		Assert.assertEquals(s1, s2);
		System.out.println(s1 + "=" +s2);
	}
	

}
