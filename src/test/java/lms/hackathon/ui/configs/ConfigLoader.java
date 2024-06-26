package lms.hackathon.ui.configs;

public class ConfigLoader {

	private static String browserType = "chrome";

	public static void setBrowserType(String browser) {
		browserType = browser;
	}

	public static String getBrowserType() throws Throwable {
		if (browserType != null)
			return browserType;
		else
			throw new RuntimeException("browser not specified in the testng.xml");
	}
}
