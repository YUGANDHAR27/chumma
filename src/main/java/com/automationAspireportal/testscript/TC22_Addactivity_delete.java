package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC22_Addactivity_delete extends TestsuiteBase
{
	ReadTimesheetModuleLocators read= new ReadTimesheetModuleLocators();
	public void deleteactivity() 
	{
		AdminLogin login=new AdminLogin(driver);
		login.adminlogin();
		driver.findElement(By.xpath(read.adminaddactivity())).click();
		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[1]/div/div/div/div/a")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String ActivityExpect="Alerts Monitoring";
		driver.findElement(By.xpath(read.adminactvity())).sendKeys(ActivityExpect);
		Select Activiftyfor = new Select(driver.findElement(By.xpath("//*[@id=\"projectType\"]")));
		Activiftyfor.selectByVisibleText("Single project");
		Select Selectclinet = new Select(driver.findElement(By.xpath("//*[@id=\"selectClient\"]")));
		Selectclinet.selectByVisibleText("Hyper Loop");
		Select Selectproject = new Select(driver.findElement(By.xpath("//*[@id=\"selectProject\"]")));
		Selectproject.selectByVisibleText("Hyper Loop");
		driver.findElement(By.xpath("//*[@id=\"saveActivity\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"delete_58\"]/i")).click();
	}

}
