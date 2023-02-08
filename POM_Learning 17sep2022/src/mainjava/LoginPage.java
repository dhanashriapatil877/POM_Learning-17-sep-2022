package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest{
	
	//all locators of page
	
     @FindBy(xpath="//*[text()='Login']")
     WebElement txtloginpage;
     
     
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(tagName="button")
	WebElement btnlogin;
	
	
	//Initialization of locators/variables
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//methods required to perform test steps
	
	/*
	 * Author:Dhanashri Patil
	 * Date:07 feb 2023
	 * Description:This test method use to verfy login page title
	 * Parameter return:string
	 */
	
	public String titleOfLoginPage() {
		return txtloginpage.getText();
	}
	
	/*
	 * Author:Dhanashri Patil
	 * Date:07 feb 2023
	 * Description:This test method use to  verify current url of page
	 * Parameter return:string
	 */
	
	public String urlOfPage() {
		return driver.getCurrentUrl();
	}
	
	/*
	 * Author:Dhanashri Patil
	 * Date:07 feb 2023
	 * Description:This test method use to set to username value
	 * Parameter return:string
	 */
	
	public void setUserName(String userName) {
		username.sendKeys(userName);
		
	}
	/*
	 * Author:Dhanashri Patil
	 * Date:07 feb 2023
	 * Description:This test method use to set to password value
	 * Parameter return:string
	 */
	 public void setPassword(String Password) {
		password.sendKeys(Password);
		 }
	
	 /*
		 * Author:Dhanashri Patil
		 * Date:07 feb 2023
		 * Description:This test method use to click on login button 
		 */
	
	public void clickOnLoginButton() {
		btnlogin.click();
	}
	
	/*
	 * Author:Dhanashri Patil
	 * Date:07 feb 2023
	 * Description:This test method use to get title of build  
	 * Parameter return:string
	 */

	
	public String getBuildTitle() {
		return driver.getTitle();
	}

	public void clickLoginBtn() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}