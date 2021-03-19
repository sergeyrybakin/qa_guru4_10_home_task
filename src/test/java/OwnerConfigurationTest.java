import config.WebDriverConfigTest;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class OwnerConfigurationTest extends WebDriverConfigTest
{

    @Test
    public void testOwnerConfiguration () {
        open("https://selenide.org");
        assertThat(title()).startsWith("Selenide");
    }
}
