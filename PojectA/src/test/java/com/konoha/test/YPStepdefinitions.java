package com.konoha.test;

import com.konoha.YP.YPHomePage;
import com.konoha.bdd.tools.WebTesterTools;
import com.konoha.bdd.tools.XMLReadAndWrite;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class YPStepdefinitions {

	YPHomePage yPHomePage = new YPHomePage();

	@Given("^user is in YP$")
	public void user_is_in_YP() throws Throwable {
		WebTesterTools.INSTANCE.getURL(XMLReadAndWrite.xmlReader.getValue("projectA", "url"));
	}

	@Given("^user log in as \"([^\"]*)\"$")
	public void user_log_in_as(String arg1) throws Throwable {
		yPHomePage.SignINYP(arg1);
	}

	@Then("^user should be in YP homePage$")
	public void user_should_be_in_YP_homePage() throws Throwable {
		yPHomePage.VerifyYPHomePage();
	}
}
