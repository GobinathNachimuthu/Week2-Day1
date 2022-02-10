package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\MavenProject\\driver\\chromedriver.exe");
		// to open the browser.1
		ChromeDriver driver = new ChromeDriver();
		// to load the URL.2
		driver.get("http://leaftaps.com/opentaps/control/main");
		// to maximize the browser.3
		driver.manage().window().maximize();

		// to enter username.4
		driver.findElement(By.id("username")).sendKeys("Democsr");
		// to enter password.5
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// to click login.6
		driver.findElement(By.className("decorativeSubmit")).click();
		// to click CRM/SFA.7
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HDFC Bank");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gobinath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nachimuthu");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("25/06/1998");
		driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("INR - Indian Rupee");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9080144643");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gobinachimuthu7@gmail.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("4/357, AKS Nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Koduvai");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Tiruppur");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("IN-TN");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("638660");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		
	}

}
