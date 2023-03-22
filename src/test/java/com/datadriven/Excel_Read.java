package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Arthiha\\Downloads\\Read.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		Cell c = wb.getSheetAt(0).getRow(0).getCell(0);
		String value = c.getStringCellValue();
		System.out.println(value);
	}

}
