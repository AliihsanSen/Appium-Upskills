package upskills.day01;

import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class C01_SetupDriver {

    @Test
    public void testdesiredCapabilities(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("automationname","uiautomator2");
    }

    @Test
    public void testUiAutomator2Options(){

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android")
                .setAutomationName("uiautomator2");
    }
}
