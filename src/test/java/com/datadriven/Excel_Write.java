package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Arthiha\\Downloads\\Read.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		
		wb.getSheetAt(0).createRow(2).createCell(0).setCellValue("Rifa");
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
	}

}
