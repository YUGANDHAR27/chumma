package com.automationAspireportal.testscript;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.Logout;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.helper.employeeLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;
import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadLocators;


public class TC01_EmployeePage extends TestsuiteBase {
	ReadExcel excel=new ReadExcel(0);
	ReadTimesheetModuleLocators reademp=new ReadTimesheetModuleLocators();

//	public TC01_EmployeePage(WebDriver driver) {
//		this.driver = driver;
//	}

 @Test
	public void employeeModule() {
		
		employeeLogin loginin = new employeeLogin(driver);
		loginin.employeelogin();
		driver.findElement(By.xpath(reademp.slectActivity())).click();
		driver.findElement(By.xpath(reademp.activity())).click();
		driver.findElement(By.xpath(reademp.clickonMonday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(reademp.clickonTuesday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(reademp.clickonwednesday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(reademp.clickonThursday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(reademp.clickonFriday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(reademp.clickonNotes())).click();
		driver.findElement(By.xpath(reademp.giveNotes())).sendKeys("Thank you Sir");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(reademp.clickcheck())).click();
		driver.findElement(By.xpath(reademp.clickonAddactivity())).click();
		driver.findElement(By.xpath(reademp.selectactivity1())).click();
		driver.findElement(By.xpath(reademp.activity2())).click();
		driver.findElement(By.xpath(reademp.deleteactivity())).click();
		driver.findElement(By.xpath(reademp.saveTimesheet())).click();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(reademp.submit())).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//	String Actualresult = driver.getTitle();
	//	assertEquals(Actualresult, Expeectedresult);
		Logout out = new Logout(driver);
		out.logoutEmployeemodule();
		
		
		
	}
	

}
