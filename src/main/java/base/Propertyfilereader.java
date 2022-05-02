package base;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfilereader {
	
	Properties pro;
	
	public Propertyfilereader()
	{
		try {pro=new Properties();
		String configurepath="C:\\Users\\mas\\eclipse-workspace\\NewMaven\\configuration\\config.properties";
		FileInputStream file=new FileInputStream(configurepath);
		pro.load(file);	
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	public String getUrl()
	{
		String tempUrl=pro.getProperty("url");
		return tempUrl;
	}
	
	public String getChromeKey()
	{
		String tempChromeKey=pro.getProperty("chromeKey");
		return tempChromeKey;
	}
	
	public String getChromePath()
	{
		String tempChromePath=pro.getProperty("ChromeDriverPath");
		return tempChromePath;
	}
	
	public String getFirefoxKey()
	{
		String tempFirefoxKey=pro.getProperty("ffKey");
		return tempFirefoxKey;
	}
	
	public String getFirefoxPath()
	{
		String tempFirefoxPath=pro.getProperty("FFDriverPath");
		return tempFirefoxPath;
	}

}
