package com.automationAspireportal.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.Datahelper;
import com.automationAspireportal.helper.Logout;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC13_Admin_MailSent extends TestsuiteBase {
	
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();

	public TC13_Admin_MailSent(WebDriver driver) {
		this.driver = driver;

} 
	public void mail() 
	{
		//TC01_EmployeePage mail = new TC01_EmployeePage(driver);
		//mail.employeeModule();
		//Logout out = new Logout(driver);
		//out.logoutEmployeemodule();
		AdminLogin adminlogin = new AdminLogin(driver);
		adminlogin.adminlogin();
		Datahelper pullreports = new Datahelper(driver);
		pullreports.reportsdata();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
						e.printStackTrace();
		}
		driver.findElement(By.xpath(read.clickonsendtimesheet())).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(read.clickonreportinggmail())).sendKeys("suraj.konangi@atmecs.com");
		driver.findElement(By.xpath(read.clickonsendgmailbtn())).click();
		String Actualres=driver.findElement(By.xpath(read.catchpopuptext())).getText();
		String Expectedres="Something went wrong";
		assertEquals(Actualres, Expectedres);
		driver.findElement(By.xpath(read.clickonclosepopup())).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
}
