package com.automationAspireportal.testscript;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC15_Admin_ActivityReportTab extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();

	public TC15_Admin_ActivityReportTab(WebDriver driver) {
		this.driver = driver;
	}

	public void manageractivityReports() throws AWTException {
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.clickonreports())).click();
		driver.findElement(By.xpath("//a[@id='activityreport-tab']")).click();
	}

}
