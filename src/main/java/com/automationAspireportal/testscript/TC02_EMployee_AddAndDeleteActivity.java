package com.automationAspireportal.testscript;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.helper.employeeLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;
import com.automationAspireportal.utils.ReadExcel;

public class TC02_EMployee_AddAndDeleteActivity extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	public TC02_EMployee_AddAndDeleteActivity(WebDriver driver) {
		this.driver = driver;
			}


	public void employeeModuleaddactivity() {
		//String Expeectedresult = "Aspire HR Portal";
		employeeLogin loginin = new employeeLogin(driver);
		loginin.employeelogin();
		driver.findElement(By.xpath(read.clickonAddactivity())).click();
		driver.findElement(By.xpath(read.deleteactivity())).click();
		
		
	}
	


}
