package Pagespkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_page {

WebDriver driver;
	
  @FindBy(xpath="//*[@id=\"first-name\"]")
  WebElement Firstname;

  @FindBy(xpath="//*[@id=\"last-name\"]")
  WebElement Lastname;
  
  @FindBy(xpath="//*[@id=\"postal-code\"]")
  WebElement Postalcode;
  
  @FindBy(xpath="//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")
  WebElement Continue;
  
  @FindBy(xpath="//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")
  WebElement Finish;
	
	public Checkout_page(WebDriver driver)
	{
		  this.driver=driver;
	    PageFactory.initElements(driver,this);
	    
	}

	public void Checkout()
	{
	
		
		
		Firstname.sendKeys("AJ");;
		Lastname.sendKeys("gdhjkj");
		Postalcode.sendKeys("gfhgh");;
	    Continue.click();
		Finish.click();
		
}
	
	
}
