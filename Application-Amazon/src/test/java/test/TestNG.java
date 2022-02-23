package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.AddToCart;
import pom.HomePage;
import pom.SmartPhone;




public class TestNG {
	
	private WebDriver driver;
	private HomePage homepage;
	private SmartPhone smartphone;
	private AddToCart addtocart;
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launchBrowser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
		 driver = new ChromeDriver();	
	}
	@BeforeMethod
	public void openningOfAmazon ()
	{
	  System.out.println("openningOfAmazon");	
	  driver.get("https://www.amazon.com");
	  
	  HomePage homepage = new HomePage(driver);
		homepage.clickOnDont();
		homepage.searchSmartPhone();
		
		SmartPhone smartphone = new SmartPhone(driver);
		smartphone.clickOnSmartPhone();
		smartphone.clickOnMob();
		
		AddToCart addtocart = new AddToCart(driver);
		addtocart.clickOnAdd();
		
	}
	
	@Test(priority=1)
	public void toVerifySmartPhone()
	{
	 System.out.println("toVerifySmartPhone");

	 String url =driver.getCurrentUrl();
	 System.out.println(url);
	 if(url.equals("https://www.amazon.com/s?k=smartphone&crid=1MNYSO1S9J4E&sprefix=smartphone%2Caps%2C1612&ref=nb_sb_ss_ts-doa-p_2_10"))
	 {
		 System.out.println("PASS");
	 }
	 else
	 {
		 System.out.println("FAIL");
	 }
	}
	 
	 @Test(priority=2)
	 public void toVerifyToClickAddToCart()
	 {
		 System.out.println("toVerifyToClickAddToCart");
		 String url =driver.getCurrentUrl();
		 System.out.println(url);
		 if(url.equals("https://www.amazon.com/cart/smart-wagon?newItems=Ca6dc85db-319f-41bc-924c-44af646a85c1,1&cartObjectKey=H6TF4H745GKP4ZYEY9YD"))
		 {
			 System.out.println("PASS");
		 }
		 else
		 {
			 System.out.println("FAIL");
		 }
	 }
	
	@AfterMethod
	public void endBrowser()
	{
		System.out.println("endBrowser");
	}
	@AfterClass
	public void closedBrowser()
	{
		System.out.println("closedBrowser");
		driver.quit();
	}


}
