package com.selenium.training1.SeleniumSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenProg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String vtitle=driver.getTitle();
		System.out.println(vtitle);
		Thread.sleep(5000);
		driver.close();
	}

}
