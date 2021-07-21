package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC19_AllEmployeesTab_Pdf  extends TestsuiteBase
{
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
	public TC19_AllEmployeesTab_Pdf(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void allemployeesPdf() 
	{
		TC18_Admin_AllEmployeesTab tab=new TC18_Admin_AllEmployeesTab(driver);
		tab.allemployeetab();
		driver.findElement(By.xpath(read.clickonpdf())).click();
	}



}
