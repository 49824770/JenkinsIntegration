package com.jenkinsintegration.appium;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class UIautomation {
	
	@Test
	public static void main() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, System.getProperty("PlatformName"));
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, System.getProperty("PlatformVersion"));
//		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
//		cap.setCapability("app", "com.example.apple-samplecode.UICatalog");
		cap.setCapability("app", "/Users/yike01/Library/Developer/Xcode/DerivedData/UICatalog-epiofhbptanmbjfmootkorassyks/Build/Products/Debug-iphonesimulator/UICatalog.app");
		cap.setCapability("noreset", true);
		
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Buttons\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Activity Indicators\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Alert Controller\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Date Picker\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Image View\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Page Control\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Picker View\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Progress Views\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Segmented Controls\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Sliders\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Steppers\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Switches\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Text Fields\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Text View\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Web View\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Search\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Toolbars\"]").click();
		driver.findElementByIosUIAutomation("target.frontMostApp().navigationBar().leftButton()").click();
		
//		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0].tapWithOptions({tapOffset:{x:0.10, y:0.15}})");
		
//		driver.findElementByIosUIAutomation("target.frontMostApp().mainWindow().tableViews()[0]").click();
		
		

//		driver.findElementByIosUIAutomation("UIATarget.localTarget.frontMostApp().navigationBar().leftButton().tap();").click();
//		driver.findElementByIosUIAutomation("UIATarget.localTarget.frontMostApp().mainWindow().tableViews()[0].cells()[\"Buttons\"]").click();
		
		
		
		
		

		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
