package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class tamilMatirmony {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.tamilmatrimony.in/");
	
	WebElement selectProfile = driver.findElement(By.xpath("//select[@name='REGISTERED_BY']"));
	Select selectProfileIP = new Select(selectProfile);
	selectProfileIP.selectByVisibleText("Myself");
	
	WebElement name=driver.findElement(By.xpath("//input[@id='NAME']"));
	name.sendKeys("Sheriff");
	WebElement gender = driver.findElement(By.xpath("//input[@id='gendermale']"));
	gender.click();
	
	
	WebElement date = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
	Select dateIP = new Select(date);
	dateIP.selectByIndex(02);

	
	WebElement month = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
	Select monthIP = new Select(month);
	monthIP.selectByIndex(10);

	
	WebElement year = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
	Select yearIP = new Select(year);
	yearIP.selectByIndex(50);


	WebElement religion = driver.findElement(By.xpath("//select[@id='RELIGION']"));
	Select religionIP = new Select(religion);
	religionIP.selectByVisibleText("Muslim - Sunni");


	WebElement motherTongue = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
	Select mtIP = new Select(motherTongue);
	mtIP.selectByIndex(17);


	WebElement country = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
	Select countryIP = new Select(country);
	countryIP.selectByVisibleText("India");


	WebElement mobile = driver.findElement(By.xpath("//input[@id='MOBILENO']"));
	mobile.sendKeys("6369498348");


	WebElement email = driver.findElement(By.xpath("//input[@id='EMAIL']"));
	email.sendKeys("khso.india@gmail.com");

	
	Thread.sleep(4000);
	driver.quit();
	
}
}
