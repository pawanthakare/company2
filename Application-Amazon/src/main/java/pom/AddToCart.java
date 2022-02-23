package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	@FindBy (xpath = "//input[@id='add-to-cart-button']")
	private WebElement add ;
    
	public AddToCart(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void clickOnAdd()
	{
		add.click();
	}

}
