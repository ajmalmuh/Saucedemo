package Pagespkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart_page {

	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")
	WebElement Addtocartbackpack;
	
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")
	WebElement Addtocartbikelight;
	
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")
	WebElement Addtocartbolttshirt;
	
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button")
	WebElement Addtocartfleecejacket;
	
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")
	WebElement Addtocartonesie;
	
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button")
	WebElement Addtocartredtshirt;	
	
	public Addtocart_page(WebDriver driver)
	{
		  this.driver=driver;
	    PageFactory.initElements(driver,this);
	    
	}

	public void Addtocart()
	{
	
		
		
		Addtocartbackpack.click();
		Addtocartbikelight.click();
		Addtocartbolttshirt.click();
		Addtocartfleecejacket.click();
		Addtocartonesie.click();
		Addtocartredtshirt.click();
}
}