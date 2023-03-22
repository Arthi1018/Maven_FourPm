package com.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver browser_Launch() {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    return driver;
	}
	
	public static void launch_Url(String url) {
    driver.get(url);
    driver.manage().window().maximize();
	}
	
	public static void input(WebElement element, String input) {
    element.sendKeys(input);
	}
	
	public static void click(WebElement element) {
    element.click();
	}
	
	public static void dropdown_Select(WebElement element, String text, String value) {
    Select s=new Select(element);
    if (text.equals("value")) {
		s.selectByValue(value);
	}
    else if (text.equals("text")) {
		s.selectByVisibleText(value);
	}else {
		int i = Integer.parseInt(value);
		s.selectByIndex(i);
	}
	}
	public static void mouse(String text, WebElement element) {
	Actions a=new Actions(driver);
	if (text.equals("click")) {
		a.click(element).perform();
	}
	else if (text.equals("context click")) {
		a.contextClick(element).perform();
	}
	else if (text.equals("double click")) {
		a.doubleClick(element).perform();
	}
	}
	
	public static void navigation_To(String url) {
    driver.navigate().to(url);
	}
	
	public static void implicit_Wait(long time, TimeUnit unit) {
    driver.manage().timeouts().implicitlyWait(time, unit);
	}
	
	public static Object data_Read(String path, int sindex, int rindex, int cindex) throws IOException {
	File f=new File(path);
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Cell cell = wb.getSheetAt(sindex).getRow(rindex).getCell(cindex);
	CellType ct = cell.getCellType();
	if (ct.equals(CellType.STRING)) {
		String value = cell.getStringCellValue();
		return value;
	}else {
		double value = cell.getNumericCellValue();
		return value;
	}
	}

}
