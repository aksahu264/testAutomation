package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTestFW {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoho.com/");
		System.out.println("Opened Successfully");
		driver.manage().window().maximize();
		driver.quit();
		
//		driver.findElement(By.className("zgh-login")).click();
//		driver.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys("aksahu4124@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span"));
	}

}
