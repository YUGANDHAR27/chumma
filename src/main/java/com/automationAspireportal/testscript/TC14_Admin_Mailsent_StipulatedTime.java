package com.automationAspireportal.testscript;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.Logout;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.helper.employeeLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC14_Admin_Mailsent_StipulatedTime extends TestsuiteBase {
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();

	public TC14_Admin_Mailsent_StipulatedTime(WebDriver driver) {
		this.driver = driver;
	}
	public void stipulatedmail() throws InterruptedException
	{
		AdminLogin adminlogin = new AdminLogin(driver);
		adminlogin.adminlogin();
		driver.findElement(By.xpath(read.clickonreports())).click();
		driver.findElement(By.xpath(read.clickontimesheetsenttab())).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select selectclient = new Select(driver.findElement(By.xpath(read.clickontimesheesenttclient())));
		//selectclient.deselectByValue("0");
		selectclient.selectByValue("10");
			
		
		Select selectproject = new Select(driver.findElement(By.xpath(read.clickontimeshetsentproject())));
		 //new WebDriverWait(Driver, TimeSpan.FromSeconds(10)).Until(ExpectedConditions.ElementIsVisible("your selector"); 
		Thread.sleep(2000);
		selectproject.deselectByValue("0");
		selectproject.selectByValue("56");
		
		WebElement startdate = driver.findElement(By.xpath(read.tsstartingdate()));
		startdate.clear();
		startdate.sendKeys("19/07/2021");
		startdate.sendKeys(Keys.ENTER);
		WebElement endate = driver.findElement(By.xpath(read.tsenddate()));
		endate.clear();
		endate.sendKeys("23/07/2021");
		endate.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(read.timesheetsentsearch())).click();
	
		Thread.sleep(5000);
	}
	
		}
		
	

