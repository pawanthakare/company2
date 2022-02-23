package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SmartPhone {
	
	private WebDriver driver;
	@FindBy (xpath = "(//div[text()='smartphone'])[2]")
	private WebElement smartphone;
	
	@FindBy (xpath = "(//img[@class='s-image'])[1]")
	private WebElement mob ;
    
	public SmartPhone(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
		this.driver=driver1;
	}
	
	public void clickOnSmartPhone()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20); //20 seconds
	
	 wait.until( ExpectedConditions.visibilityOf(smartphone));
	

		smartphone.click();
	}
	
	public void clickOnMob()
	{
		mob.click();
	}

}
