package com.adactin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browsername) {
	
		
		try {
			if(browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\welcome\\eclipse-workspace\\Adactin2\\Driver\\chromedriver.exe" );
				 driver = new ChromeDriver();
				
			}else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\mani_\\eclipse-workspace\\SeleniumConcepts\\Drivers\\IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}else {
				System.out.println("invalid browsername");
			}
			
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return driver;
				
	}
	
	public static void getUrl(String url) {
		
		try {
			driver.get(url);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}
	
	public static void InputToWebelement(WebElement element, String value ) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	}

	public static void sendIp(String xpathExpression, CharSequence arg0) {
		try {
			WebElement xPath = driver.findElement(By.xpath(xpathExpression));
			xPath.sendKeys(arg0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	}
	
	public static void browserClose() {
		try {
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void browserQuit() {
		try {
			driver.manage().timeouts().implicitlyWait(26,TimeUnit.SECONDS);
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void naviToUrl(String url) {
		try {
			driver.navigate().to(url);
			driver.manage().timeouts().implicitlyWait(26,TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void navi(String ipString) {
		try {
			if (ipString.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
				driver.manage().timeouts().implicitlyWait(26,TimeUnit.SECONDS);
			}else if (ipString.equalsIgnoreCase("back")) {
				driver.navigate().back();		
				driver.manage().timeouts().implicitlyWait(26,TimeUnit.SECONDS);
			}else if (ipString.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();	
				driver.manage().timeouts().implicitlyWait(26,TimeUnit.SECONDS);
			}else {
				System.out.println("incorrect arugument");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
	public static void dropDown(WebElement element, String value, String option) {
		Select s = new Select(element);
		try {
			if (option.equalsIgnoreCase("value")) {
				s.selectByValue(value);			
			}else if (option.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);
				
			}else if (option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
				
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}		
	}
	
	public static void clickOnWebElement(WebElement clickElement) {
		try {
			clickElement.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void  moveToElement(WebElement element) {
		waitForElement(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForElement(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public static void jScriptExecutor(WebElement element, String value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			if (value.equalsIgnoreCase("pcontainer")) {
				js.executeScript("arguments[0].scrollIntoView();", element);		
				
			}else if (value.equalsIgnoreCase("pcheckout")) {
				js.executeScript("arguments[0].click();", element);	
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}
	
	public static void takesScreenShot(String filename ) throws IOException {
		try {
			TakesScreenshot sc1 = (TakesScreenshot) driver;
			File srcFile = sc1.getScreenshotAs(OutputType.FILE);
			File destFile = new File (System.getProperty("user.dir") + "\\Screenshot\\" + filename + ".png");
			FileUtils.copyFile(srcFile, destFile);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} 
		}
		
	}
	
	


