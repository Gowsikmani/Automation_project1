package Page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Utilities.Base;

public class Create_acc extends Base {
	
	
    By createaccount = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
	By Page_title=By.xpath("//*[@id=\'maincontent\']/div[1]/h1/span");
	By Frst_name = By.xpath("//*[@id=\'firstname\']");
	By lst_name = By.xpath("//*[@id=\'lastname\']");
	By email  = By.xpath("//*[@id=\'email_address\']");
	By Password = By.xpath("//*[@id=\'password\']");
	By cnfm_pwd = By.xpath("//*[@id=\'password-confirmation\']");
	By Crt_button= By.xpath("//*[@id=\'form-validate\']/div/div[1]/button/span");
	By acc_crt_msg= By.xpath("//*[@id=\'maincontent\']/div[1]/div[2]/div/div/div");
	
    public void sendvalues() {
    	
		
		WebElement we1 = driver.findElement(createaccount);
		we1.click();
		
		WebElement we2 = driver.findElement(Page_title);
		String s= we2.getText();
		String t= read_excel(1,2);
		s.equals(t);
	
		WebElement we3 = driver.findElement(Frst_name);
		we3.sendKeys(read_excel(2,2));

		
		WebElement we4= driver.findElement(lst_name);
		we4.sendKeys(read_excel(3,2));
	
		WebElement we5 = driver.findElement(email);
		we5.sendKeys(read_excel(4,2));
	
		WebElement we6 = driver.findElement(Password);
		we6.sendKeys(read_excel(5,2));
	
		WebElement we7 = driver.findElement(cnfm_pwd);
		we7.sendKeys(read_excel(6,2));
	
		WebElement we8 = driver.findElement(Crt_button);
		we8.click();
		
		WebElement we9 = driver.findElement(acc_crt_msg);
		String s1 = we9.getText();
		System.out.println(s1);
				
    }
		
	

}
