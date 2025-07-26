package base;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static FileReader fr;
	public static Properties prop = new Properties();
	
	@BeforeTest
	public void setUp() throws IOException {
		
		if(driver == null) {
			
			FileReader fr = new FileReader("C:\\\\Users\\\\aksah\\\\eclipse-workspace\\\\com.artifactId\\\\src\\\\test\\\\resources\\\\configfiles\\\\config.properties");
			prop.load(fr);			
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			driver.manage().window().maximize();
			
		}		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		System.out.println("tear down successful");
	}

}
