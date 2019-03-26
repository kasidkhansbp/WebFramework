$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/konoha/test/YPLogin.feature");
formatter.feature({
  "line": 1,
  "name": "YP Login",
  "description": "",
  "id": "yp-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2639988164,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login into Yellow Page",
  "description": "",
  "id": "yp-login;login-into-yellow-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is in YP",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user log in as \"qetest786@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user should be in YP homePage",
  "keyword": "Then "
});
formatter.match({
  "location": "YPStepdefinitions.user_is_in_YP()"
});
formatter.result({
  "duration": 3698869793,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qetest786@gmail.com",
      "offset": 16
    }
  ],
  "location": "YPStepdefinitions.user_log_in_as(String)"
});
formatter.result({
  "duration": 5527211884,
  "status": "passed"
});
formatter.match({
  "location": "YPStepdefinitions.user_should_be_in_YP_homePage()"
});
formatter.result({
  "duration": 10059654157,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027yp-header\u0027]/div/div/nav[2]/div/a[1]\"}\n  (Session info: chrome\u003d46.0.2490.86)\n  (Driver info: chromedriver\u003d2.20.353124 (035346203162d32c80f1dce587c8154a1efa0c3b),platform\u003dMac OS X 10.10.5 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10.06 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027mohammads-MacBook-Pro.local\u0027, ip: \u0027192.168.17.34\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_45\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{userDataDir\u003d/var/folders/v0/p_6s7th143d62_fmf85d7z4h0000gn/T/.org.chromium.Chromium.KC6X7W}, takesHeapSnapshot\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d46.0.2490.86, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 9b93a66556fd5edf01d419272e0ef6c9\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027yp-header\u0027]/div/div/nav[2]/div/a[1]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:445)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:358)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:340)\n\tat com.konoha.bdd.tools.WebTesterTools.findWebElementByXpath(WebTesterTools.java:180)\n\tat com.konoha.YP.YPHomePage.VerifyYPHomePage(YPHomePage.java:14)\n\tat com.konoha.test.YPStepdefinitions.user_should_be_in_YP_homePage(YPStepdefinitions.java:26)\n\tat ✽.Then user should be in YP homePage(com/konoha/test/YPLogin.feature:6)\n",
  "status": "failed"
});
formatter.after({
  "duration": 568582227,
  "status": "passed"
});
});