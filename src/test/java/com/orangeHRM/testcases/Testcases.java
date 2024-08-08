package com.orangeHRM.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v120.audits.model.AttributionReportingIssueDetails;
import org.testng.annotations.Test;

import com.orangeHRM.pageobjects.Loginpageobjects;
import com.orangeHRM.utilities.DataProvidertestdata;
import com.orangeHRM.utilities.ReadConfig;
import com.orangeHRM.utilities.Readfiledata;

public class Testcases extends Baseclass{
	
	@Test(priority =1,enabled=false, dataProvider = "TC02Testdata",dataProviderClass =  DataProvidertestdata.class)
	public void Logintest1() 
	{
		Loginpageobjects loginpagetest=new Loginpageobjects(driver);
		loginpagetest.enterusername(username);
		loginpagetest.enterpassword(password);
		loginpagetest.entersubmit();

		
	}
	
	@Test(priority = 3,enabled=true)
	public void Logintest2() throws IOException, InterruptedException
	{
		
		Loginpageobjects loginpagetest=new Loginpageobjects(driver);
		loginpagetest.enterusername(username);
		loginpagetest.enterpassword(password);
		loginpagetest.entersubmit();
	                                                            
	    
	}
	@Test(priority =2,enabled=true, dataProvider = "TC02Testdata",dataProviderClass =  DataProvidertestdata.class)
	public void LoginWithValidCredentials(String unameexcel , String pwdexcel)
	{
		Loginpageobjects loginpagetest=new Loginpageobjects(driver);
		loginpagetest.LoginWithValidCredentials(unameexcel, pwdexcel);
		
		
	}
	
		
		
		
	}
	

