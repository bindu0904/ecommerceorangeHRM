package com.orangeHRM.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readfiledata {

	public static String[][] getData(String filepath) throws IOException
	{
		File excelfile=new File(filepath);
		FileInputStream fi = new FileInputStream(excelfile);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int numberofrows=sheet.getPhysicalNumberOfRows();
		int numberofcolumns=sheet.getRow(0).getLastCellNum();
		System.out.println(numberofrows);
		System.out.println(numberofcolumns);
		
		
		String [][] data=new String[numberofrows-1][numberofcolumns];
		
		for(int i=0;i<numberofrows-1;i++)
		{
			for(int j=0;j<numberofcolumns-1;j++)
			{
				DataFormatter df=new DataFormatter();
		        data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
		        System.out.println(data[i][j]);
			}
		}
		
		
		fi.close();
		return data;
		 
	}
	
	public static void main(String args[]) throws IOException
	{
		getData("./Testdata/userdata.xlsx");
	}
	
	


}
