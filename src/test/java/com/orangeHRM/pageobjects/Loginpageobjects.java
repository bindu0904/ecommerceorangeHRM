package com.orangeHRM.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Loginpageobjects

{
	
	
	WebDriver ldriver;
	public final static Logger logger=LogManager.getLogger("rootLogger");

	public Loginpageobjects(WebDriver rdriver)
	{
	  ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement usernamexpath;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement passwordxpath;

	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitxpath;
	
	public void enterusername(String username)
	{
		try{
			usernamexpath.sendKeys(username);
			logger.info("Entered the username");
		}catch (Exception e) {
			logger.error("This is failed at entering username");
			Assert.fail();
		} 
			
		
		
	}
	
	
	
	public void enterpassword(String password)
	{
		try {
			passwordxpath.sendKeys(password);
			logger.info("Entered the password");
			
		}catch(Exception e)  {
			logger.error("This is failed at password");
			Assert.fail();
		}
		
	}
	
	
	public void entersubmit()
	{
		try{
			submitxpath.click();
			logger.info("Clicked on Submit");
		}catch(Exception e) {
			logger.error("This is failed at clicking submit button"); 
			logger.info(e.getMessage());
			Assert.fail();
		}
		
	}
	
	public void LoginWithValidCredentials(String username, String password)
	{
	  try {
		  usernamexpath.sendKeys(username);;
		  logger.info("Entered the username" +username);
		  passwordxpath.sendKeys(password);
		  logger.info("Entered the password" +password);
		  submitxpath.click();
		  logger.info("Clicked on submit button");
	  }catch(Exception e)
	  {
	  logger.error(e.getMessage());
	  }
	  
	}
	

}