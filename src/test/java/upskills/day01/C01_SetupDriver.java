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
        capabilities.setCapability("udid","emulator-5554");
    }

    @Test
    public void testUiAutomator2Options(){

        UiAutomator2Options options = new UiAutomator2Options();
        options.setUdid("emulator-5554"); // Tek bir cihaz var ise tanımlanmayabilir.

        /**
           options.setPlatformName("android")
                .setAutomationName("uiautomator2");
                // => Bu kısmı yorum satıra almamızın sebebi UiAutomator2Options'ta tanımlamış olduğumuz objede barındırıyor olması.
         */


    }
}
