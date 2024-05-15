package org.base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class BaseClass {

	public static WebDriver driver;
	public static Robot r;

	public static void browserLaunching(String browser) {

		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} 
		else if (browser.equals("Edge")) {

			driver = new EdgeDriver();
		} 
		else if (browser.equals("Firefox")) {

			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
	}

	public static void urlLaunch(String passUrl) {

		driver.get(passUrl);
	}
	
	public static void closeTheBrowser() {

		driver.quit();
	}
	
	public static void jsClick(WebElement e) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);
	}

	
	public static void passValue(WebElement e1, String productName) {

		e1.sendKeys(productName);
	}
	
	public static void selectStateOption(WebElement e, String txt) {

		Select s = new Select(e);
		s.selectByValue(txt);
	}
	
	public static void clickElement(WebElement ele) {

		ele.click();
	}
	
	public static void switchToWindow(int win) {

		Set<String> allWin = driver.getWindowHandles();

		List<String> l = new LinkedList<String>(allWin);

		String winId = l.get(win);
		driver.switchTo().window(winId);

	}

	public static void enterKey() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void waitForWebElement() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static String getTestDataFromPropertyFile(String key) throws IOException {
 
		File f = new File("C:\\Users\\JAGADESH D\\eclipse-workspace\\WindowHandling\\TrackDfect\\TestDatas.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key); 
		return data;
	}

}
