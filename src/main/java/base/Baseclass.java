package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	
	Propertyfilereader pro=new Propertyfilereader();
	
	public WebDriver openChromeBrowser()
	{
		System.setProperty(pro.getFirefoxKey(),pro.getFirefoxPath());
		WebDriver driver=new ChromeDriver();
		driver.get(pro.getUrl());
		driver.manage().window().maximize();
		return driver;
		
	}
	public WebDriver openFirefoxBrowser()
	{
		System.setProperty(pro.getFirefoxKey(),pro.getFirefoxPath());
		WebDriver driver=new FirefoxDriver();
		driver.get(pro.getUrl());
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public void closeBrowser(WebDriver driver)
	{
		driver.close();
	}

}
