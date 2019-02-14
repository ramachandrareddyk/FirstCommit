package GridTest;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		// Define Desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		
		cap.setPlatform(Platform.WIN8_1);
		
		//chrome options definations
		
		ChromeOptions options= new ChromeOptions();
		options.merge(cap);
		
		String HubURL="http://192.168.0.106:4444/wd/hub";
		
		WebDriver driver= new RemoteWebDriver(new URL(HubURL),options);
		
		driver.get("http://www.freecrm.com");
		
		System.out.println(driver.getTitle());

	}

}
