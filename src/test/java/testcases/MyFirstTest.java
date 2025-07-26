package testcases;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import base.BaseTest;


public class MyFirstTest extends BaseTest{

	@Test
	public static void LoginTest() throws InterruptedException {
		
		
		driver.findElement(By.className("zgh-login")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys("aksahu4124@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
		
	}

}
