package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC16_Admin_StipulatedMail_Approve extends TestsuiteBase
{
 ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	public TC16_Admin_StipulatedMail_Approve(WebDriver driver) {
		this.driver = driver;
	}
	 public void stipulatedmailapprove() throws InterruptedException 
	 {
		 TC14_Admin_Mailsent_StipulatedTime approvestipulatedmail=new TC14_Admin_Mailsent_StipulatedTime(driver);
		 approvestipulatedmail.stipulatedmail();
		 driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]")).click();
	 }

}
