package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.Logout;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC12_Admin_Reject extends TestsuiteBase {
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();

	public TC12_Admin_Reject(WebDriver driver) {
		this.driver = driver;
	}
	public void adminreject() {
		TC01_EmployeePage employee=new TC01_EmployeePage(driver);
		TC04_Manager_approve approve = new TC04_Manager_approve(driver);
		approve.managerapprove();
		Logout out=new Logout(driver);
		out.logoutEmployeemodule();
		AdminLogin login = new AdminLogin(driver);
		login.adminlogin();
		
		Select select = new Select(driver.findElement(
				By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[2]/div/div/div/div[1]/div/form/div[2]/select")));
		select.selectByValue("56");
		driver.findElement(By.xpath(read.clickoncheckbox())).click();
		driver.findElement(By.xpath(read.clickonreject())).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(read.popupreject())).click();
		driver.findElement(By.xpath(read.entercomment())).sendKeys("do well");
		driver.findElement(By.xpath(read.popupreject())).click();
	

	}

}
