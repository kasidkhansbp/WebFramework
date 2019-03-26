package com.konoha.YP;

import com.konoha.bdd.tools.WebTesterTools;
import com.konoha.common.Page;

public class YPHomePage extends Page {

	private String LNK_SIGN_IN = "//*[@id='yp-header']/div/div/nav[2]/div/a[1]";
	private String TXT_EMAIL = "//*[@id='content']/div/section/div/form/label[1]/input";
	private String TXT_PWD = "//*[@id='content']/div/section/div/form/label[2]/input";
	private String BTN_SIGN_IN = "//*[@id='content']/div/section/div/form/input[2]";

	public boolean VerifyYPHomePage() {
		return WebTesterTools.INSTANCE.findWebElementByXpath(LNK_SIGN_IN).getText().equalsIgnoreCase("kasid k.");
	}

	public void SignINYP(String arg1) {
		WebTesterTools.INSTANCE.findWebElementByXpath(LNK_SIGN_IN).click();
		WebTesterTools.INSTANCE.findWebElementByXpath(TXT_EMAIL).sendKeys(arg1);
		WebTesterTools.INSTANCE.findWebElementByXpath(TXT_PWD).sendKeys("Test-123");
		WebTesterTools.INSTANCE.findWebElementByXpath(BTN_SIGN_IN).click();
	}
}
