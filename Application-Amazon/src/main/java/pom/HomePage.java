package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver;
	@FindBy (xpath = "(//input[@type='submit'])[2]")
	private WebElement dont;
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement search;
    
	public HomePage(WebDriver driver1) {
	
		PageFactory.initElements(driver1, this);
		this.driver=driver1;
	}
	
	public void clickOnDont()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20); //20 seconds
		
		 wait.until( ExpectedConditions.visibilityOf(dont));
		
		dont.click();
	}
	
	public void  searchSmartPhone()
	{
		search.sendKeys("smartphone");
	}

}
