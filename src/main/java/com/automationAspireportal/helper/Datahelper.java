package com.automationAspireportal.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class Datahelper extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();	
	
	public Datahelper(WebDriver driver)
	{
		this.driver=driver;
	}
	public void reportsdata()
	{
			}
}
