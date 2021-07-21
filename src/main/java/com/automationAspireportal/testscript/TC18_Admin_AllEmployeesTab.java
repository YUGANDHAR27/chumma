package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC18_Admin_AllEmployeesTab extends TestsuiteBase {
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
	public TC18_Admin_AllEmployeesTab(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void allemployeetab() {
		AdminLogin login = new AdminLogin(driver);
		login.adminlogin();
		Select admindrp = new Select(driver.findElement(By.xpath(read.changeloginasadmin())));
		admindrp.selectByVisibleText("Admin");
		driver.findElement(By.xpath(read.clickonreports())).click();
		driver.findElement(By.xpath(read.clickonallemployeestab())).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Select selectemployee = new Select(driver.findElement(By.xpath(read.allemployeesselectemployee())));
		selectemployee.deselectByVisibleText("All");
		selectemployee.selectByVisibleText("Employee Login");
		
		WebElement startdate = driver.findElement(By.xpath(read.allstartdate()));
		startdate.sendKeys("12/07/2021");
		startdate.sendKeys(Keys.ENTER);
		WebElement endate = driver.findElement(By.xpath(read.allenddate()));
		endate.sendKeys("16/07/2021");
		endate.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(read.allemployeesexport())).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
