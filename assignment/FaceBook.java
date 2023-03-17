package week4.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        driver.findElement(By.name("firstname")).sendKeys("Hema");
        driver.findElement(By.name("lastname")).sendKeys("Senthilkumar");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7659950232");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Password@123");
        WebElement date=driver.findElement(By.id("day"));
        Select day=new Select(date);
        day.selectByValue("26");
        WebElement date1=driver.findElement(By.id("month"));
        Select month=new Select(date1);
        month.selectByValue("6");
        WebElement date2=driver.findElement(By.id("year"));
        Select year=new Select(date2);
        year.selectByValue("2000");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
              
	}

}


