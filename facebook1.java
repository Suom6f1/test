package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook1 {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement account= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
 account.click();
 
 WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
 name.sendKeys("Suhail");
 
 WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
 lastname.sendKeys("Sheriff");
 
 WebElement number=driver.findElement(By.xpath("//input[@name='reg_email__']"));
 number.sendKeys("6369498348");
 
 WebElement newpass=driver.findElement(By.xpath("//input[@data-type='password']"));
 newpass.sendKeys("Oct12001");
 
 
 WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
	Select dateIP = new Select(date);
	dateIP.selectByIndex(1);


	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select monthIP = new Select(month);
	monthIP.selectByIndex(9);


	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select yearIP = new Select(year);
	yearIP.selectByVisibleText("2001");


	WebElement sex = driver.findElement(By.xpath("//input[@value='2']"));
	sex.click();


 
	}

}
