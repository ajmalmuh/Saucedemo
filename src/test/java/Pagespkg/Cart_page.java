package Pagespkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a/span")
	WebElement Carticon;
	
	@FindBy(xpath="//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
	WebElement Checkoutbutton;
	
	
	public Cart_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Cart()
	{
		Carticon.click();
		Checkoutbutton.click();
	}
	
	
	
	
}
