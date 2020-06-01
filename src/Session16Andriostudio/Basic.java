package Session16Andriostudio;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Basic {

	public static AndroidDriver<AndroidElement> main(String[] args) throws MalformedURLException {
		
		File f = new File("src");
		
		File fs = new File(f,"API Demos for Android_v1.9.0_apkpure.com (1).apk");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "AshrithEmulator");
		
		dc.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		
		return driver;

	}

}

