/**
 * 
 */
package com.konoha.bdd.runner;

import com.konoha.bdd.tools.WebTesterTools;
import com.konoha.bdd.tools.WebTesterTools.WebBrowsers;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author SOMU
 *
 */
public class WebTesterHook {

	@Before
	public void initialise() {
		WebTesterTools.INSTANCE.initialiseWebDriver(WebBrowsers.CHROME);
	}

	@After
	public void quitDriver() {
		WebTesterTools.INSTANCE.quitWebDriver();
	}
}
