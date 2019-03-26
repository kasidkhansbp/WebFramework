/**
 * 
 */
package com.konoha.bdd.tools;

import java.net.MalformedURLException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.validator.UrlValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;

/**
 * This tools help in providing actions to be performed on the browser driver
 * while performing web automation testing
 * 
 * @author SOMU
 *
 */
public class WebTesterTools {

	public static WebTesterTools INSTANCE = new WebTesterTools();
	private WebDriver webDriver = null;

	private WebTesterTools() {
	}

	/**
	 * This method initialises the driver for the specified browser
	 * 
	 * @param browser
	 *            The type of browser whose webdriver is to be initialised. e.g-
	 *            Chrome, firefox, ie
	 */
	public void initialiseWebDriver(WebBrowsers browser) {
		switch (browser) {
		case CHROME:
			ChromeDriverManager.getInstance().setup();
			webDriver = new ChromeDriver();
			webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;
		case FIREFOX:
			webDriver = new FirefoxDriver();
			webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;
		case IE:
			InternetExplorerDriverManager.getInstance().setup();
			webDriver = new InternetExplorerDriver();
			webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;
		// case SAFARI:
		// System.setProperty("webdriver.safari.noinstall", "true");
		// SafariOptions options = new SafariOptions();
		// options.setUseCleanSession(true);
		// webDriver = new SafariDriver();
		// break;
		case OPERA:
			OperaDriverManager.getInstance().setup();
			webDriver = new OperaDriver();
			webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;
		// case EDGE:
		// EdgeDriverService service = new EdgeDriverService.Builder()
		// .usingDriverExecutable(new
		// File("path/to/my/MicrosoftWebDriver.exe")).usingAnyFreePort().build();
		// try {
		// service.start();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// webDriver = new RemoteWebDriver(service.getUrl(),
		// DesiredCapabilities.edge());
		// break;
		default:
			webDriver = new InternetExplorerDriver();
			webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

	/**
	 * Provides enum values of the popular browsers to help the tester in
	 * initialising the driver of the specific browser they want to work with
	 * while performing automation testing.
	 *
	 */
	public static enum WebBrowsers {
		CHROME {
			@SuppressWarnings("unused")
			public String getDetail() {
				return "Google Chrome";
			}
		},
		FIREFOX {
			@SuppressWarnings("unused")
			public String getDetail() {
				return "Firefox";
			}
		},
		IE {
			@SuppressWarnings("unused")
			public String getDetail() {
				return "Internet Explorer";
			}
		},
		// TODO need certificate from apple
		// SAFARI {
		// @SuppressWarnings("unused")
		// public String getDetail() {
		// return "Safari";
		// }
		// },
		OPERA {
			@SuppressWarnings("unused")
			public String getDetail() {
				return "Opera";
			}
		},
		// TODO : future extension
		// EDGE {
		// @SuppressWarnings("unused")
		// public String getDetail() {
		// return "Microsoft Edge";
		// }
		// }
	}

	/**
	 * {@see WebDriver#get(String)}
	 * 
	 * @param url
	 *            the url to open
	 */
	public void getURL(String url) throws MalformedURLException {
		UrlValidator urlValidator = new UrlValidator();
		if (urlValidator.isValid(url))
			webDriver.get(url);
		else
			throw new MalformedURLException(url + " is not a valid url");
	}

	/**
	 * finds the Link WebElement
	 * 
	 * @param linkText
	 *            the text of the link WebElement
	 */
	public WebElement findWebElementbyLinkText(String linkText) throws NoSuchElementException {
		WebElement link = webDriver.findElement(By.linkText(linkText));
		return link;
	}

	/**
	 * finds the WebElement by its id.
	 * 
	 * @param id
	 *            the id of the Web element
	 */
	public WebElement findWebElementById(String id) throws NoSuchElementException {
		WebElement element = webDriver.findElement(By.id(id));
		return element;
	}

	/**
	 * finds the WebElement by its xpath.
	 * 
	 * @param xpath
	 *            the xpath of the Web element
	 */
	public WebElement findWebElementByXpath(String xpath) throws NoSuchElementException {
		WebElement element = webDriver.findElement(By.xpath(xpath));
		return element;
	}

	/**
	 * finds the WebElement by its name.
	 * 
	 * @param name
	 *            name of the web element
	 */
	public WebElement findWebElementByName(String name) throws NoSuchElementException {
		WebElement element = webDriver.findElement(By.name(name));
		return element;
	}

	/**
	 * finds the WebElement by its tag name.
	 * 
	 * @param tagName
	 *            tag name of the Web element
	 */
	public WebElement findWebElementByTagName(String tagName) throws NoSuchElementException {
		WebElement element = webDriver.findElement(By.tagName(tagName));
		return element;
	}

	/**
	 * finds the WebElement by its partial link Text.
	 * 
	 * @param linkText
	 *            the partial link text of the Web element
	 */
	public WebElement findWebElementByPartialLinkText(String linkText) throws NoSuchElementException {
		WebElement element = webDriver.findElement(By.partialLinkText(linkText));
		return element;
	}

	/**
	 * Quits the driver, closing every associated window of the browser
	 */
	public void quitWebDriver() {
		if (webDriver != null) {
			webDriver.quit();
			webDriver = null;
		}
	}

}
