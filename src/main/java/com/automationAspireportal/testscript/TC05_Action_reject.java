package com.automationAspireportal.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.Logout;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC05_Action_reject extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	public TC05_Action_reject(WebDriver driver) {
		this.driver = driver;
	}
	@Test
	public void manageractionApprove() {
		
		TC01_EmployeePage empage = new TC01_EmployeePage(driver);
		empage.employeeModule();
		Logout out = new Logout(driver);
		out.logoutEmployeemodule();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.clickoncheckbox())).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(read.entercomment())).sendKeys("thank you");
		driver.findElement(By.xpath(read.popupreject())).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	

}
