package com.automationAspireportal.testscript;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC10_Manager_ReportsPageExcel extends TestsuiteBase
{
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
	public TC10_Manager_ReportsPageExcel(WebDriver driver) {
		this.driver = driver;
	}


   @Test
	public void managerReportsexcel() throws AWTException {
		
		TC08_manager_ReportsPage excel = new TC08_manager_ReportsPage(null);
		excel.managerReports();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(read.clickonexcel())).click();	
	}
}
