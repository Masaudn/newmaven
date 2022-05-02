package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Baseclass;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy;
import net.bytebuddy.utility.RandomString;
import pages.Buywindow;
import pages.Homepage;
import pages.Login;

import utility.utility;

public class logintest extends Baseclass {
	WebDriver driver;
	Login lgn;
	
	@BeforeClass
	public void OpenBrowser()
	{
		driver=openFirefoxBrowser();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
@Test
  public void Log() 
  { lgn=new Login(driver);
	  lgn.Enterusername();
	  lgn.Enterpassword();
	  lgn.Clicksubmit();
	  lgn.Enterpin();
		lgn.Entercontinue();
  }

@Test(dependsOnMethods="Log")
public void homepage()
{Homepage h=new Homepage(driver);
h.SearchShare();
h.selectshare(driver);	
}

@Test(dependsOnMethods="homepage")
public void regularmarket()
{Buywindow buying=new Buywindow(driver);
buying.Selectnse();
buying.Selectregular();
buying.Selectintraday();
//buying.Selectmarket();
buying.Selectsl();
buying.Enterquantity();
buying.Enterprice();
buying.Entertriggerprice();
buying.Clickonbuy();
	
}







@AfterMethod
public void screenShot(ITestResult result) throws IOException
{if(ITestResult.SUCCESS==result.getStatus())
{
	String abc=RandomString.make(3);
	utility.screenShot(driver,abc);
}
else if(ITestResult.FAILURE==result.getStatus())
{	String abc=RandomString.make(3);
	utility.screenShot(driver,abc);
	
}
	
}

}
