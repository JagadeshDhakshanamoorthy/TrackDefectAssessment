$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Flipkart.feature");
formatter.feature({
  "name": "To validate purchase module in flipkart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate add to cart and remove from cart of Sony camera products",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To lanuch flipkart in chrome browser and search product",
  "keyword": "Given "
});
formatter.match({
  "location": "StepRunner.to_lanuch_flipkart_in_chrome_browser_and_search_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select product and add into the cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepRunner.to_select_product_and_add_into_the_cart()"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found in the current frame\n  (Session info: chrome\u003d124.0.6367.202)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception\nBuild info: version: \u00274.17.0\u0027, revision: \u0027e52b1be057*\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.20\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [662bf9715d474b3cfa59d08072033cf9, clickElement {id\u003df.7BC09DC468D8E3883EE793F11D53E423.d.C2507ACDAB8EB3873ABCFEC9831FB658.e.58}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 124.0.6367.202, chrome: {chromedriverVersion: 124.0.6367.207 (a9001a6e39f..., userDataDir: C:\\Users\\JAGADE~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:49835}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:49835/devtoo..., se:cdpVersion: 124.0.6367.202, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on windows (662bf9715d474b3cfa59d08072033cf9)] -\u003e xpath: //button[text()\u003d\u0027Add to cart\u0027]]\nSession ID: 662bf9715d474b3cfa59d08072033cf9\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:185)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:134)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:51)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:519)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:223)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:76)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat org.base.BaseClass.clickElement(BaseClass.java:69)\r\n\tat org.step.StepRunner.to_select_product_and_add_into_the_cart(StepRunner.java:34)\r\n\tat ✽.To select product and add into the cart(file:src/test/resources/Flipkart.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To place order and login into flipkart application",
  "keyword": "And "
});
formatter.match({
  "location": "StepRunner.to_place_order_and_login_into_flipkart_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To select the deliver address and doing payment",
  "keyword": "And "
});
formatter.match({
  "location": "StepRunner.to_select_the_deliver_address_and_doing_payment()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepRunner.to_close_the_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
});