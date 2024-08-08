package com.orangeHRM.testcases;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orangeHRM.utilities.ReadConfig;

public class Baseclass {

	
	public static WebDriver driver;
	
	ReadConfig details;
	public String url;
	public String username;
	public String password;
	
	@BeforeMethod
	public void start() throws InterruptedException, IOException
	{
		driver=new ChromeDriver();
		details=new ReadConfig();
		
		 url=   details.geturl();
	     username= details.getusername();
	     password=details.getpassword(); 
	     
	     driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
	      

	}
		@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
