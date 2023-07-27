package com.actitime.generic;
//class for Test data

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//GenericMethod
public class FilLib {
	public String getPropertyData(String key) throws IOException
	{
	
FileInputStream fis=new FileInputStream("./data/commondata.property");
Properties p=new Properties();
p.load(fis);
String keyValue = p.getProperty(key);
return keyValue;

	}
	public String getExcelData(String sheetName,int row,int cell,String path) throws IOException
	{
	
		 FileInputStream fis=new FileInputStream(path); 
		 Workbook wb=WorkbookFactory.create(fis);
		 String excelData = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		 return excelData;

	}
}
