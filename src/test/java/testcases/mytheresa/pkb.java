package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectRepository.mytheresa.MytheresaAccountInformationPage;
import objectRepository.mytheresa.MytheresaCreateAccountPage;
import objectRepository.mytheresa.MytheresaHomePage;
import objectRepository.mytheresa.MytheresaMyAccountPage;

import static variables.mytheresa.UserVariables.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.*;
import org.testng.Assert;
import java.net.*;
import org.testng.annotations.Test;
public class pkb {
	static WebDriver driver;
	String actualTitle;
@Test
public void testgooglrsearch() throws MalformedURLException{
 try {
//WebDriver driver = newFirefoxDriver();
//FirefoxOptions options = new FirefoxOptions();
//options.addArguments("-headless");
//WebDriver driver = new RemoteWebDriver(new URL("http://40.113.221.175:4444/wd/hub"),new FirefoxOptions());
System.out.println("I am testFirefox");
driver = new RemoteWebDriver(new URL("http://52.186.156.179:4444/wd/hub"),new FirefoxOptions());
driver.get("http://www.google.com");
actualTitle = driver.getTitle();
System.out.println("ActualTitle is :" + actualTitle );
//we expect the title “Google “ should be present 
//String Expectedtitle = "Google";
//it will fetch the actual title 
//String Actualtitle = driver.getTitle();
//System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
//it will compare actual title and expected title
//Assert.assertEquals(Actualtitle, Expectedtitle);
//print out the result
//System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
 }
catch (MalformedURLException e) {
      // if key is not a valid path then it cannot be resolved to an unmanged resource
	System.out.println("incorrect url");
    }
 }
}
	
