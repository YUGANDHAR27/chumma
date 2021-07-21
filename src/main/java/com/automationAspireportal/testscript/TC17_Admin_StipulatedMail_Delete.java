package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC17_Admin_StipulatedMail_Delete extends TestsuiteBase {
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();

	public TC17_Admin_StipulatedMail_Delete(WebDriver driver) {
		this.driver = driver;
	}

	public void stipulatedmailateddelete() throws InterruptedException {
		TC14_Admin_Mailsent_StipulatedTime approvestipulatedmail = new TC14_Admin_Mailsent_StipulatedTime(driver);
		approvestipulatedmail.stipulatedmail();
		String nodata = "No data available in table";
		if (nodata != driver.findElement(By.xpath("//*[@id=\"exportTable\"]/tbody/tr/td")).getText()) {
			driver.findElement(By.xpath("//*[@id=\"Selectall\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"Cancel_delete\"]")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(read.clickontimesheetsentdelete())).click();

		}

	}
}
