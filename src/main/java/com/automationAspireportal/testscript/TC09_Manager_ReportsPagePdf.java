package com.automationAspireportal.testscript;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC09_Manager_ReportsPagePdf extends TestsuiteBase
{
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();

	public TC09_Manager_ReportsPagePdf(WebDriver driver) {
		this.driver = driver;
	}
	public void managerReportspdf() throws AWTException {
		
		TC08_manager_ReportsPage pdf = new TC08_manager_ReportsPage(driver);
		pdf.managerReports();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(read.clickonpdf())).click();
	}
}
