package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.Logout;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC04_Manager_approve extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	public TC04_Manager_approve(WebDriver driver) {
		this.driver = driver;
	}
@Test
	public void managerapprove() {
		
		TC01_EmployeePage empage = new TC01_EmployeePage(driver);
		empage.employeeModule();
		Logout out = new Logout(driver);
		out.logoutEmployeemodule();

		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.clickoncheckbox())).click();
		driver.findElement(By.xpath(read.clickonApprove())).click();
		}
	
	
	

}
