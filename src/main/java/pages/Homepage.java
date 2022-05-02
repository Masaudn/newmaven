package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
  @FindBy(xpath="(//input[@type='text'])[1]") private WebElement search;
  @FindBy(xpath="(//span[text()='TATAMOTORS'])[2]") private WebElement selectshare;
  @FindBy(xpath="//button[@class='button-blue']") private WebElement Buy;
  
  
  public Homepage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void SearchShare()
  {
	  search.sendKeys("TATAMOTORS");
  }
  
  public void  selectshare(WebDriver driver)
  {
  Actions act=new Actions(driver);
  act.moveToElement(selectshare).build().perform();
  act.moveToElement(Buy).click().build().perform();
 
  
  
  }
  

}
