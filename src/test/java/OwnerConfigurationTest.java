import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class OwnerConfigurationTest {

//    @BeforeEach
//    public void initBrowser () {
//        final RunningConfiguration config = ConfigFactory
//                .create(RunningConfiguration.class, System.getProperties());
//        Configuration.browser = config.browserName();
//        Configuration.browserVersion = config.browserVersion();
//    }

    @Test
    public void testOwnerConfiguration () {
        final RunningConfiguration config = ConfigFactory
                .create(RunningConfiguration.class, System.getProperties());
        Configuration.browser = config.browserName();
        Configuration.browserVersion = config.browserVersion();

        System.out.println(config.browserName());
        System.out.println(config.browserVersion());
        System.out.println(config.runningLocation());
        //        open("https://selenide.org");
//        assertThat(title()).startsWith("Selenide");
//        assertThat(System.getProperty("browser")).isEqualTo("firefox");
    }
}