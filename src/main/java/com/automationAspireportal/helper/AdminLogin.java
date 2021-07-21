package com.automationAspireportal.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadLocators;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class AdminLogin extends TestsuiteBase
{
	ReadLocators read=new ReadLocators ();
	ReadExcel excel;
	ReadTimesheetModuleLocators readloc=new ReadTimesheetModuleLocators();
	public AdminLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void adminlogin() 
	{
		 int n=2;
		 excel=new ReadExcel(n);
		 driver.findElement(By.xpath(read.emailPath())).sendKeys(excel.getmail());
		 driver.findElement(By.xpath(read.passwordPath())).sendKeys(excel.password());
		 driver.findElement(By.xpath(read.clickOnLogin())).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(read.clickontimesheet())).click();
		 Select admindrp = new Select(driver.findElement(By.xpath(readloc.changeloginasadmin())));
			admindrp.selectByVisibleText("Admin");
	}

}
