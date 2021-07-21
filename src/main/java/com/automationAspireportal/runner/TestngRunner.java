package com.automationAspireportal.runner;

import org.testng.annotations.Test;

import com.automationAspireportal.testscript.TC02_EMployee_AddAndDeleteActivity;
import com.automationAspireportal.testsuite.TestsuiteBase;

public class TestngRunner extends TestsuiteBase
{
	@Test
	public void login() throws Exception  {
		//TC01_EmployeePage tc = new TC01_EmployeePage(driver);
		 //tc.employeeModule();
		//TC01_ManagerPage tc1 = new TC01_ManagerPage(driver);
		//tc1.managertimesheetmodule();	
		
		// AdminLogin login=new AdminLogin(driver);
		// login.adminlogin();Offshore
		//TC02_MangershiftsPage tc2=new TC02_MangershiftsPage(driver);
		//tc2.updatingshifts();
		//TC02_EmployeeLogout out=new TC02_EmployeeLogout(driver);
		//out.logout();
		//TC08_manager_ReportsPage tc08=new TC08_manager_ReportsPage(driver);
		//tc08.managerReports();
		//TC06_Manager_Reject reject=new TC06_Manager_Reject(driver);
		 //reject.managerreject();
		//TC01_Action_reject actrejct=new TC01_Action_reject(driver);
		//actrejct.manageractionreject();
		//TC02_Action_approve approve=new TC02_Action_approve(driver);
		//approve.manageractionapprove();
		//TC03_Action_approve actapprove=new TC03_Action_approve(driver);
		//actapprove.manageractionapprove();
	//	TC09_Manager_ReportsPagePdf tc09=new TC09_Manager_ReportsPagePdf(driver);
		//tc09.managerReportspdf();
	//	TC10_Manager_ReportsPageExcel tc10=new TC10_Manager_ReportsPageExcel(driver);
	//	tc10.managerReportsexcel();
		//TC11_Manager_AllEmployeeTab tab=new TC11_Manager_AllEmployeeTab(driver);
		//tab.manageralltab();
		//driver.close();
	//	TC13_Admin_MailSent TC13 = new TC13_Admin_MailSent(driver);
	//	TC13.mail();
		//AdminLogin Login = new AdminLogin(driver);
		//Login.adminlogin();
		//TC14_Mail_stipulated_time TC14 = new TC14_Mail_stipulated_time(driver);
		//TC14.stipulated();
	
		TC02_EMployee_AddAndDeleteActivity add=new TC02_EMployee_AddAndDeleteActivity(driver);
		add.employeeModuleaddactivity();
	}
	
	

}
