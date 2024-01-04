package Testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import Basepkg.Basesaucedemo;
import Pagespkg.Addtocart_page;
import Pagespkg.Cart_page;
import Pagespkg.Checkout_page;
import Pagespkg.Login_page;
import Pagespkg.Logout_page;


public class Testsaucedemo extends Basesaucedemo
{

@Test

public void test() throws InterruptedException, IOException 
{
	
	Login_page ob=new Login_page(driver);
	ob.Login();
	
	Addtocart_page ob1=new Addtocart_page(driver);
	ob1.Addtocart();
	
	Cart_page ob2=new Cart_page(driver);
	ob2.Cart();
	
	Checkout_page ob3=new Checkout_page(driver);
	ob3.Checkout();
	
	
	Logout_page ob4=new Logout_page(driver);
	ob4.Logout();
}
}
