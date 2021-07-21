package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.Logout;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;


public class TC03_Action_approve extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	//public TC03_Action_approve(WebDriver driver) {
		//this.driver = driver;
	//}
@Test
	public void manageractionapprove()
	{
		//TC01_EmployeePage empage = new TC01_EmployeePage();
		//empage.employeeModule();
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.clickonApproveaction())).click();
		driver.findElement(By.xpath(read.clickonApprove())).click();
		}


}
