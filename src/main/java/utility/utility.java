package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utility {
	
	static WebDriver driver;
	public static void screenShot(WebDriver driver,String abc) throws IOException {
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File Destination=new File("C:\\Users\\mas\\Pictures\\Scrennshot\\"+abc+".jpg");
		 FileHandler.copy(source, Destination);
	}
	
	public static void Explicitwait(WebElement pin)
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(pin));
		
	}
	
	
	

}
