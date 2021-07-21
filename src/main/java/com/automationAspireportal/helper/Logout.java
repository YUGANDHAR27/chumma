package com.automationAspireportal.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class Logout extends TestsuiteBase
{
ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
public Logout(WebDriver driver)
{
	this.driver=driver;
}
public void logoutEmployeemodule() 
{
	driver.findElement(By.xpath(read.profile())).click();
	driver.findElement(By.xpath(read.clickonlogout())).click();
	}


}
