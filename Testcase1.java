package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\MavenProject\\driver\\chromedriver.exe");
		//to open the browser.1
		ChromeDriver driver = new ChromeDriver();
		//to load the URL.2
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the browser.3
		driver.manage().window().maximize();
		
		//to enter username.4
		driver.findElement(By.id("username")).sendKeys("Democsr");
		//to enter password.5
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//to click login.6
		driver.findElement(By.className("decorativeSubmit")).click();
		//to click CRM/SFA.7
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//to click contacts tab.8
		driver.findElement(By.partialLinkText("Contacts")).click();
		//to click create contact.9
		driver.findElement(By.partialLinkText("Create Contact")).click();
		//to type first name.10
		driver.findElement(By.className("inputBox")).click();
		driver.findElement(By.className("inputBox")).sendKeys("Gobinath");
		
		//to type last name.11
		driver.findElement(By.id("lastNameField")).click();
		driver.findElement(By.id("lastNameField")).sendKeys("Nachimuthu");
		
		//To Click Create Contact
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}

}
