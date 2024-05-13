package Utilities;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base extends excel_testdata {
	
   static public WebDriver driver;
	

	public static void launch_browser(String url) throws IOException {
		
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe" );
	    driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
		
		
		}
	
	public static void close_browser() {
		driver.close();
	}
	
	public static void get_scrn_shot(String Filename) throws IOException {
		
		String File_path = "C:\\Users\\LENOVO\\Desktop\\selenium assignments\\Screenshots\\";
		String fullpath = File_path+Filename;
		TakesScreenshot scr_shot= ((TakesScreenshot)driver);
		File f =scr_shot.getScreenshotAs(OutputType.FILE);
	    File loc =new File(fullpath);
	    FileUtils.copyFile(f, loc);
	}
	

}
