package com.automationAspireportal.testscript;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.Logout;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;


public class TC06_Manager_Reject extends TestsuiteBase 
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	public TC06_Manager_Reject(WebDriver driver) {
		this.driver = driver;
	}
 @Test
	public void managerreject() {
		
		TC01_EmployeePage empage = new TC01_EmployeePage(driver);
		empage.employeeModule();
		Logout out = new Logout(driver);
		out.logoutEmployeemodule();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.clickoncheckbox())).click();
		driver.findElement(By.xpath(read.clickonreject())).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(read.entercomment())).sendKeys("Do well");
		driver.findElement(By.xpath(read.popupreject())).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
