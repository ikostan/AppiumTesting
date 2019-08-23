package test_cases;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class TestWebBrowser {
	
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException{
		
		// Browser + Device
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		//Open Web Browser on Google page and type "Hello Appium" in search field
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello Appium");
		
		//Pause for 4 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}

}