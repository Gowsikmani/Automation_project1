package Page_objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.Base;

public class Signin_page extends Base {
	
	By signin_hpg_btn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
	By email = By.xpath("//*[@id=\'email\']");
	By pwd = By.xpath("//*[@id=\'pass\']");
	By signin_btn = By.xpath("//*[@id=\'send2\']/span");
	By fgt_pwd_btn = By.xpath("//*[@id=\'login-form\']/fieldset/div[4]/div[2]/a/span");
	By fgt_pgtitle = By.xpath("//*[@id=\'maincontent\']/div[1]/h1/span");
	By fgt_email = By.xpath("//*[@id=\'email_address\']");
	By reset_pwd = By.xpath("//*[@id=\'form-validate\']/div/div[1]/button/span");
	By resetpwd_msg = By.xpath("//*[@id=\'maincontent\']/div[2]/div[2]/div/div/div");
	By invalid_login = By.xpath("//*[@id=\'maincontent\']/div[2]/div[2]/div/div/div");
	
	public void signin_values() {
		
		WebElement we1 = driver.findElement(signin_hpg_btn);
		we1.click();
		
		WebElement we2 = driver.findElement(email);
		we2.sendKeys(read_excel(8,2));
		
		WebElement we3 = driver.findElement(pwd);
		we3.sendKeys(read_excel(9,2));
		
		WebElement we4 = driver.findElement(signin_btn);
		we4.click();		
		
		
	}
	
	public void invalid_signinvalue() {
		
		WebElement we1 = driver.findElement(signin_hpg_btn);
		we1.click();
		
		WebElement we2 = driver.findElement(email);
		we2.sendKeys(read_excel(11,2));
		
		WebElement we3 = driver.findElement(pwd);
		we3.sendKeys(read_excel(12,2));
		
		WebElement we4 = driver.findElement(signin_btn);
		we4.click();
		
		WebElement we5 = driver.findElement(invalid_login);
		String s1 = we5.getText();
		System.out.println("Invalid login error msg:  " + s1);
		
	}
	
	public void forgot_pwd() {
		
		WebElement we1 = driver.findElement(signin_hpg_btn);
		we1.click();
		
		WebElement we5 = driver.findElement(fgt_pwd_btn);
		we5.click();
		
		WebElement we6 = driver.findElement(fgt_pgtitle);
		String s1 = we6.getText();
		String s2 = read_excel(15,2);
		s1.equals(s2);
		
		WebElement we7 = driver.findElement(fgt_email);
		we7.sendKeys(read_excel(14,2));
		
		WebElement we8 =driver.findElement(reset_pwd);
		we8.click();
		
		WebElement we9 = driver.findElement(resetpwd_msg);
		String s3= we9.getText();
		System.out.println("msg to reset password : "+s3);
		
		
		
	}

}
