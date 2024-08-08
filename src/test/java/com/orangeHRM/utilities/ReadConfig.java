package com.orangeHRM.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
public static Properties pro;
    
	public ReadConfig() throws IOException
	{
		
	File file=new File("./Configuration/config.properties");
	FileInputStream fi=new FileInputStream(file);
	
	pro=new Properties();
	pro.load(fi);
	
	}
	
	public String geturl()
	{
		String url=pro.getProperty("url");
		return url;
	}
	public String getusername()
	{
		String username=pro.getProperty("username");
		return username;
	}
    public String getpassword()
    {
    	String password=pro.getProperty("password");
    	return password;
    }
}


