package Pagespkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement SDusername;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement SDpswd;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement SDloginbutton;
	
	
	public Login_page(WebDriver driver)
	{
		  this.driver=driver;
	    PageFactory.initElements(driver,this);
	    
	}

	public void Login()
	{
	
		
		SDusername.sendKeys("standard_user");
		SDpswd.sendKeys("secret_sauce");
		SDloginbutton.click();
	
	
	}
	

}
