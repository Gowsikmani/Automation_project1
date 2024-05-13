package Page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;

public class Homepage extends Base {
	
	By men_tab = By.xpath("//*[@id=\'ui-id-5\']");
	By men_pg_title = By.xpath("//*[@id=\'page-title-heading\']/span");
	
	By women_tab = By.xpath("//*[@id=\'ui-id-4\']/span[2]");
	By women_pg_title = By.xpath("//*[@id=\'page-title-heading\']/span");
	
	By Whatsnew_tab = By.xpath("//*[@id=\'ui-id-3\']/span");
	By Whatsnew_tab_title = By.xpath("//*[@id=\'page-title-heading\']/span");
	
	By cart_btn = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
	By cart_msg = By.xpath("//*[@id=\'minicart-content-wrapper\']/div[2]/strong");
	
	By searchbox = By.xpath("//*[@id=\'search\']");
	By search_rslt_pgtitle = By.xpath("//*[@id=\'maincontent\']/div[1]/h1/span");
	
	public void vrfy_men_tab() {
		
		WebElement we1 = driver.findElement(men_tab);
		we1.click();
		
		WebElement we2= driver.findElement(men_pg_title);
		String s1 = we2.getText();
		String s2 = "Men";
		if(s1.equals(s2)) {
			System.out.println("It is a men page");
		}
		else {
			System.out.println("Its not a mens page");
		}
		
	}
	
	public void vrfy_women_tab() {
		
		WebElement we1 = driver.findElement(women_tab);
		we1.click();
		
		WebElement we2= driver.findElement(women_pg_title);
		String s1 = we2.getText();
		String s2 = "Women";
		if(s1.equals(s2)) {
			System.out.println("It is a Women page");
		}
		else {
			System.out.println("Its not a Womens page");
		}
		
	}
	
	public void vrfy_Whatsnew_tab() {
		
		WebElement we1 = driver.findElement(Whatsnew_tab);
		we1.click();
		
		WebElement we2= driver.findElement(Whatsnew_tab_title);
		String s1 = we2.getText();
		String s2 = "What's New";
		if(s1.equals(s2)) {
			System.out.println("It is a What's New page");
		}
		else {
			System.out.println("Its not a What's New page");
		}
	}
	
	public void Verify_empty_cart() {
		
		WebElement we1 = driver.findElement(cart_btn);
		we1.click();
		
		WebElement we2= driver.findElement(cart_msg);
		String s1 = we2.getText();
		String s2 = "You have no items in your shopping cart.";
		if(s1.equals(s2)) {
			System.out.println("Empty cart success");
		}
		else {
			System.out.println("Empty cart not success");
		}
			
	}
	
	public void Searchbox() {
		
		WebElement we1 = driver.findElement(searchbox);
		we1.sendKeys(read_excel(22,2));
		Actions builder1 = new Actions(driver);
		  builder1
		         .keyDown(Keys.ENTER)
		         .keyUp(Keys.ENTER)
		         .build().perform();
		
		WebElement we2= driver.findElement(search_rslt_pgtitle);
		String s1 = we2.getText();
		String s2 = read_excel(23,2);
		if(s1.equals(s2)) {
			System.out.println("Searchbox is success");
		}
		else {
			System.out.println("Search box is not success");
		}
		
		
	}
	
	

}
