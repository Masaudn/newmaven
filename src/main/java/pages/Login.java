package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.annotations.VisibleForTesting;

public class Login {
	
	@FindBy(xpath="//input[@id='userid']") private WebElement username;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement submitbutton;
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continuebutton;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Enterusername()
	{username.sendKeys("HX2837");}
	
	public void Enterpassword()
	{password.sendKeys("Masaud@1995");}
	
	public void Clicksubmit()
	{submitbutton.click();}
	
	
 public void Enterpin()
	
	{ pin.sendKeys("921818");}
 
	public void Entercontinue()
	{continuebutton.click();}
}

	
	

		





