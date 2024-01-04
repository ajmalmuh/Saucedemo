package Pagespkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_page {
	
	
WebDriver driver;
	
   

   @FindBy(xpath="//*[@id=\"menu_button_container\"]/div/div[3]/div/button")
   WebElement Burgermenubutton;
   
   @FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
   WebElement Logoutbutton;

	
	
	public Logout_page(WebDriver driver)
	{
		  this.driver=driver;
	    PageFactory.initElements(driver,this);
	    
	}

	public void Logout()
	{
	
		
		
		Burgermenubutton.click();
		Logoutbutton.click();
	
	}
	

}
