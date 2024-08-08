package com.orangeHRM.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProvidertestdata {
	
	
	@DataProvider
	public String[][]  TC02Testdata() throws IOException
	{
		Readfiledata testdata=new Readfiledata();
		String [] [] data=testdata.getData("./Testdata/userdata.xlsx");
		return data;
	}
	
}
