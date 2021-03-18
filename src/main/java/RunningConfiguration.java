import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${where}.properties"
})
public interface RunningConfiguration extends Config {

    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("running.location")
    String runningLocation();

}
