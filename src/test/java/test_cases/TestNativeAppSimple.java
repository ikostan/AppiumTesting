package test_cases;

import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestNativeAppSimple {
	
	public static AppiumDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		
		// Browser + Device
		File test_app = new File("C:\\Users\\superadmin\\eclipse-workspace\\AppiumTesting\\test_app\\selendroid-test-app-0.17.0.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android_Tablet");
		capabilities.setCapability(MobileCapabilityType.APP, test_app.getAbsolutePath());
		
		//Open Web Browser on Google page and type "Hello Appium" in search field
		driver = new AndroidDriver(, capabilities);	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Pause for 2 seconds
		Thread.sleep(2000);
		
		driver.quit();
	}
}
