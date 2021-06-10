package Test;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Assign {

	public AndroidDriver capabilities() throws MalformedURLException {
		 DesiredCapabilities cap = new DesiredCapabilities();
		   
		    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Mee");
		    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		    cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
		    cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
		   
		    cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\MeenakshiVenkatachal\\Downloads\\chromedriver_win32f\\chromedriver.exe");
		    AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			return driver;
	}

}
