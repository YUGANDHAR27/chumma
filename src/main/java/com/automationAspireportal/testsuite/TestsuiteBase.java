package com.automationAspireportal.testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.automationAspireportal.constants.FilePathConstants;
import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.Logout;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.helper.employeeLogin;
import com.automationAspireportal.testscript.TC05_Action_reject;
import com.automationAspireportal.testscript.TC01_EmployeePage;
import com.automationAspireportal.testscript.TC02_EMployee_AddAndDeleteActivity;
import com.automationAspireportal.testscript.TC04_Manager_approve;
import com.automationAspireportal.testscript.TC07_MangershiftsPage;
import com.automationAspireportal.testscript.TC03_Action_approve;
import com.automationAspireportal.testscript.TC08_manager_ReportsPage;
import com.automationAspireportal.testscript.TC09_Manager_ReportsPagePdf;
import com.automationAspireportal.testscript.TC10_Manager_ReportsPageExcel;
import com.automationAspireportal.testscript.TC11_Manager_MoreThan31Days;
import com.automationAspireportal.testscript.TC12_Admin_Reject;
import com.automationAspireportal.testscript.TC13_Admin_MailSent;
import com.automationAspireportal.testscript.TC14_Admin_Mailsent_StipulatedTime;
import com.automationAspireportal.testscript.TC15_Admin_ActivityReportTab;
import com.automationAspireportal.testscript.TC18_Admin_AllEmployeesTab;
import com.automationAspireportal.testscript.TC16_Admin_StipulatedMail_Approve;
import com.automationAspireportal.testscript.TC20_Admin_FreezeShifts;
import com.automationAspireportal.testscript.TC21_Admin_Addactivity;
import com.automationAspireportal.testscript.TC06_Manager_Reject;
import com.automationAspireportal.utils.ReadLocators;

public class TestsuiteBase

{
	public WebDriver driver;
	ReadLocators read = new ReadLocators();

	@BeforeClass
	public void launchAspire() {
		System.setProperty("webdriver.chrome.driver", FilePathConstants.CHROME_FILE);
		driver = new ChromeDriver();
		String path = read.Url();
		driver.get(path);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	//@AfterClass
	//public void teardown() {

		//driver.close();

	//}

	/* @Test
	 public void login() throws Exception {
	 TC01_EmployeePage tc = new TC01_EmployeePage(driver);
	 tc.employeeModule();
	// TC01_ManagerPage tc1 = new TC01_ManagerPage(driver);
	// tc1.managertimesheetmodule();

	// AdminLogin login=new AdminLogin(driver);
	// login.adminlogin();Offshore
	// TC02_MangershiftsPage tc2=new TC02_MangershiftsPage(driver);
	// tc2.updatingshifts();
	// TC02_EmployeeLogout out=new TC02_EmployeeLogout(driver);
	// out.logout();
	 TC08_manager_ReportsPage tc08=new TC08_manager_ReportsPage(driver);
	 tc08.managerReports();
	// TC06_Manager_Reject reject=new TC06_Manager_Reject(driver);
	// reject.managerreject();
	// TC01_Action_reject actrejct=new TC01_Action_reject(driver);
	// actrejct.manageractionreject();
	// TC02_Action_approve approve=new TC02_Action_approve(driver);
	// approve.manageractionapprove();
	// TC03_Action_approve actapprove=new TC03_Action_approve(driver);
	// actapprove.manageractionapprove();
	// TC09_Manager_ReportsPagePdf tc09=new TC09_Manager_ReportsPagePdf(driver);
	// tc09.managerReportspdf();
	// TC10_Manager_ReportsPageExcel tc10=new TC10_Manager_ReportsPageExcel(driver);
	// tc10.managerReportsexcel();

	// driver.close();
	// TC13_Admin_MailSent TC13 = new TC13_Admin_MailSent(driver);
	// TC13.mail();
	// AdminLogin Login = new AdminLogin(driver);
	// Login.adminlogin();
	// TC14_Admin_Mailsent_StipulatedTime tc14= new
	// TC14_Admin_Mailsent_StipulatedTime(driver);
	// tc14.stipulated();
	// TC12_Admin_Reject adreject=new TC12_Admin_Reject(driver);
	// adreject.adminreject();

	// TC02_EMployee_AddAndDeleteActivity add=new
	// TC02_EMployee_AddAndDeleteActivity(driver);
	// add.employeeModuleaddactivity();
	// TC07_MangershiftsPage shifts=new TC07_MangershiftsPage(driver);
	// shifts.updatingshifts();
	// TC04_Manager_approve aprove=new TC04_Manager_approve(driver);
	// aprove.managerapprove();
	// TC15_Manager_ActivityReport activity=new TC15_Manager_ActivityReport(driver);
	// activity.manageractivityReports();
	// TC16_Admin_AllEmployeesTab tab=new TC16_Admin_AllEmployeesTab(driver);
	// tab.allemployeetab();
	// TC11_Manager_MoreThan31Days days=new TC11_Manager_MoreThan31Days(driver);
	// days.reportsmorethan31days();
	// TC16_Admin_StipulatedMail_Approve approvestipulated=new
	// TC16_Admin_StipulatedMail_Approve(driver);
	// approvestipulated.stipulatedmailapprove();
	// TC20_Admin_FreezeShifts freeze=new TC20_Admin_FreezeShifts(driver);
	// freeze.freezeshifts();
	// TC17_Admin_AllEmployeesTab tab=new TC17_Admin_AllEmployeesTab(driver);
	// tab.allemployeetab();
	// TC20_Admin_Addactivity add=new TC20_Admin_Addactivity(driver);
	// add.adminaddactivity();
	 }*/
}
