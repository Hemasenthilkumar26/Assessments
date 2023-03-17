package week4.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UiBank {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
        driver.get("https://uibank.uipath.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.linkText("Register For Account")).click();
        driver.findElement(By.id("firstName")).sendKeys("Hema ");
        WebElement titleDropDown=driver.findElement(By.id("title"));
        Select title=new Select(titleDropDown);
        title.selectByVisibleText("Ms");
        driver.findElement(By.id("middleName")).sendKeys("S M");
        driver.findElement(By.id("lastName")).sendKeys("Senthilkumar");
        WebElement sexDropDown=driver.findElement(By.id("sex"));
        Select sex=new Select(sexDropDown);
        sex.selectByVisibleText("Female");
        WebElement statusDropDown=driver.findElement(By.id("employmentStatus"));
        Select status=new Select(statusDropDown);
        status.selectByVisibleText("Unemployed");
        driver.findElement(By.id("username")).sendKeys("Hemasenthil");
        driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Password@123");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

	}

}
