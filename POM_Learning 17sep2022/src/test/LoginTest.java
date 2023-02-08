package test;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test(priority=0,groups ={"smoke","regression"})
	public void verifyTitleOfLoginPage() {
	  String verifyTitleOfLoginPage =loginPage.titleOfLoginPage();
	  AssertJUnit.assertEquals(verifyTitleOfLoginPage," Login");
	}
	
	@Test(priority=1,groups= {"smoke","regression"})
	public void verifyCurrentUrlOfPage() {
		String verifyCurrentUrlOfPage =loginPage.urlOfPage();
		AssertJUnit.assertEquals(verifyCurrentUrlOfPage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=2,groups= {"smoke","regression"})
	     public void verifyLoginWithCorrectCredntial() {
		loginPage.setUserName("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickLoginBtn();
		String titleOfDash=dashBoardPage.titleOfDashBoardPage();
		AssertJUnit.assertEquals(titleOfDash,"Dashboard");
		}
	
	@Test(priority =-1, groups= {"smoke","regreesion"})
	public void verifyBuildTitleName() {
		String verifyTitleOfBuild=loginPage.getBuildTitle();
		AssertJUnit.assertEquals(verifyTitleOfBuild,"OrangeHRM");
		
	}
	
	
	
}