package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashBoardPage extends BaseTest{
	//all locators of page 
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement titleDashBoard;
	


//Initialization of locator/variables
public DashBoardPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}

//all method on page 
//all method on page

	/*
	 * Author:Dhanashri Patil
	 * Date:07 feb 2023
	 * Description:This test method use to verify dashboard page title
	 * Parameter return:string
	 */
	
	public String titleOfDashBoardPage() {
		return titleDashBoard.getText();
		
	}
	
}

