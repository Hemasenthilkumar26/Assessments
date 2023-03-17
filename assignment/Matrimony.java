package week4.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.tamilmatrimony.in/");
    	driver.findElement(By.id("NAME")).sendKeys("Hema");
		driver.findElement(By.id("genderfemale")).click();
		 WebElement date=driver.findElement(By.id("DOBDAY"));
	        Select day=new Select(date);
	        day.selectByValue("1");
	        WebElement date1=driver.findElement(By.id("DOBMONTH"));
	        Select month=new Select(date1);
	        month.selectByValue("12");
	        WebElement date2=driver.findElement(By.id("DOBYEAR"));
	        Select year=new Select(date2);
	        year.selectByValue("2000");
	        WebElement reliDropDown=driver.findElement(By.id("RELIGION"));
	        Select religion=new Select( reliDropDown);
	        religion.selectByVisibleText("No Religious Belief");
	        WebElement motherTongueDropDown=driver.findElement(By.name("MOTHERTONGUE"));
	        Select motherTongue=new Select(motherTongueDropDown);
	        motherTongue.selectByVisibleText("Tamil");
	        WebElement countryDropDown=driver.findElement(By.id("COUNTRY"));
	        Select country=new Select(countryDropDown);
	        country.selectByVisibleText("India");
	        WebElement countryCodeDropDown=driver.findElement(By.id("M_COUNTRYCODE"));
	        Select countryCode=new Select(countryCodeDropDown);
	        countryCode.selectByVisibleText("+91");
	        driver.findElement(By.id("MOBILENO")).sendKeys("9646620545");
	        driver.findElement(By.id("EMAIL")).sendKeys("abc@gmail.com");
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

	}

}
