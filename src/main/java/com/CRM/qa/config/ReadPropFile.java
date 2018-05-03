package com.CRM.qa.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\6199\\Desktop\\Java Project\\CRMTest\\FreeCRMTest\\src\\main\\java\\com\\CRM\\qa\\config\\config.properties");
        prop.load(ip);
        System.out.println(prop.getProperty("name"));
        String url=prop.getProperty("URL");
        System.out.println(url);
        String browsername=prop.getProperty("browser");
        System.out.println(browsername);
        
        if(browsername.equals("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\6199\\Downloads\\chromedriver_win32\\chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.manage().deleteAllCookies();
        }
        
        driver.get(url);
        
        driver.findElement(By.xpath(prop.getProperty("Email_xpath"))).sendKeys(prop.getProperty("Email"));
        driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("Password"));
        Thread.sleep(4000);
        driver.findElement(By.xpath(prop.getProperty("Login_xpath"))).click();
        
        
	}

}
