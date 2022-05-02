package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buywindow {
	
	@FindBy(xpath="(//label[@class='su-radio-label'])[1]") private WebElement bse ;
	@FindBy(xpath="(//label[@class='su-radio-label'])[2]") private WebElement nse;
	
	
	@FindBy(xpath="//label[text()='Regular']") private WebElement regular;
	@FindBy(xpath="//label[text()='Cover']") private WebElement cover;
	@FindBy(xpath="//label[text()='AMO']") private WebElement amo;
	@FindBy(xpath="//label[text()='Iceberg']") private WebElement iceberg;
	
	
	@FindBy(xpath="(//label[@class='su-radio-label'])[7]") private WebElement intraday ;
	@FindBy(xpath="(//label[@class='su-radio-label'])[8]") private WebElement longterm;
	
	
	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement quantity;
	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement  price ;
	@FindBy(xpath="(//input[@type='number'])[3]") private WebElement triggerprice;
	
	
	@FindBy(xpath="(//label[@class='su-radio-label'])[9]") private WebElement market ;
	@FindBy(xpath="(//label[@class='su-radio-label'])[10]") private WebElement limit;
	@FindBy(xpath="(//label[@class='su-radio-label'])[11]") private WebElement sl;
	@FindBy(xpath="(//label[@class='su-radio-label'])[12]") private WebElement slmarket;
	
	
	@FindBy(xpath="//button[@class='submit']") private WebElement buy;
	@FindBy(xpath="(//label[@class='su-radio-label'])[12]") private WebElement cancel;
	

	public Buywindow(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Selectbse()
	{
		bse.click();
	}
	public void Selectnse()
	{
		nse.click();
	}
	public void Selectregular()
	{
		regular.click();
	}
	public void Selectcover()
	{
	  cover.click();
	}
	public void Selectamo()
	{
		amo.click();
	}
	public void Selecticeberg()
	{
		iceberg.click();
	}
	public void Selectintraday()
	{
		intraday.click();
	}
	public void Selectlongterm()
	{
		longterm.click();
	}
	public void Enterquantity()
	{  quantity.clear();
		quantity.sendKeys("5");
	}
	public void Enterprice() 
	{ price.clear();
		price.sendKeys("450");
	}
	public void Entertriggerprice() 
	{  triggerprice.clear();
	triggerprice.clear();

		triggerprice.sendKeys("445");
	}
	public void Selectmarket()
	{
		market.click();
	}
	public void Selectlimit()
	{
		limit.click();
	}
	public void Selectsl()
	{
		sl.click();
	}
	public void Selectslmarket()
	{
		slmarket.click();
	}
	public void Clickonbuy()
	{
		buy.click();
	}
	public void Clickoncancel()
	{
		cancel.click();
	}
	
	
}
