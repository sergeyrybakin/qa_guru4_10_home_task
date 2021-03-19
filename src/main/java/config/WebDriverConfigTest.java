package config;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;

public class WebDriverConfigTest
{

    final static RunningConfiguration config = ConfigFactory
            .create(RunningConfiguration.class, System.getProperties());

    @BeforeAll
    public static void setupWebDriver() {
        Configuration.browser = config.browserName();
        Configuration.browserVersion = config.browserVersion();
        System.out.println("Browser: " + config.browserName());
        System.out.println("Browser version: " + config.browserVersion());

        if(config.runningLocation()!=null) {
            System.out.println("Running location: " + config.runningLocation());
            Configuration.remote = config.runningLocation();
        }
    }
}
