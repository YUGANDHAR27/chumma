package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC11_Manager_MoreThan31Days extends TestsuiteBase
{
ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();	
public TC11_Manager_MoreThan31Days(WebDriver driver) {
	this.driver = driver;
}
	@Test
	public void reportsmorethan31days() {
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
	driver.findElement(By.xpath(read.clickonreports())).click();
	Select selectclient = new Select(driver.findElement(By.xpath(read.clickonselectclient())));
	selectclient.selectByVisibleText("Hyper Loop");
	Select selectproject = new Select(driver.findElement(By.xpath(read.clickonselectproject())));
	selectproject.selectByValue("56");
	selectproject.deselectByValue("0");
	WebElement startdate = driver.findElement(By.id(read.clickonstartdate()));
	startdate.sendKeys("01/07/2021");
	startdate.sendKeys(Keys.ENTER);
	WebElement endate = driver.findElement(By.id(read.clickonenddate()));
	endate.sendKeys("05/08/2021");
	endate.sendKeys(Keys.ENTER);
	Select selectemployee = new Select(driver.findElement(By.xpath(read.clickonSelectemployeedrpdwn())));
	selectemployee.selectByValue("1089");
	selectemployee.deselectByValue("0");
	Select ActivityReports = new Select(driver.findElement(By.xpath(read.clickonselctactivity())));
	ActivityReports.selectByVisibleText("Without activity");
	Select SelectStatus = new Select(driver.findElement(By.xpath(read.clickonselectstatus())));
	SelectStatus.selectByValue("0");
	Select BillingType = new Select(driver.findElement(By.xpath(read.clickonbiling())));
	BillingType.selectByVisibleText("Yes");
	Select ExportAs = new Select(driver.findElement(By.xpath(read.clickonexportAs())));
	ExportAs.selectByVisibleText("Offshore");
	Select Reporttype = new Select(driver.findElement(By.xpath(read.clickonreportAs())));
	Reporttype.selectByVisibleText("Day wise");
	driver.findElement(By.xpath(read.clickonexport())).click();
	}
}
