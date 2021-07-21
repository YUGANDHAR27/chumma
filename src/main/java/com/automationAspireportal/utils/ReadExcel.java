package com.automationAspireportal.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.automationAspireportal.constants.FilePathConstants;

public class ReadExcel {
	XSSFSheet sheet;
	int sheetindex = 0;
	File file = new File(FilePathConstants.EMPLOYEE_credentials);

	public ReadExcel(int sheetindex) {
		this.sheetindex = sheetindex;
		try {
			FileInputStream inputstream = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(inputstream);
			XSSFSheet sheet = wb.getSheetAt(sheetindex);
			this.sheet = sheet;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
		public String getmail() {
		String mail = sheet.getRow(0).getCell(1).getStringCellValue();
		return mail;

	}

	public String password() {
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		return password;
	}

	public String Workinghour() {
		return sheet.getRow(2).getCell(1).getStringCellValue();

	}
	public String getCellDataByColumnName(String sheetname, String columnname, String rowname) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
