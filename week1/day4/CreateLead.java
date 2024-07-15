package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTaps");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kishore");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nandha");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation");
		Select Industry = new Select(driver.findElement(By.name("industryEnumId")));
		Industry.selectByValue("IND_SOFTWARE");
		Select Ownership = new Select(driver.findElement(By.name("ownershipEnumId")));
		Ownership.selectByVisibleText("Public Corporation");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
	}

}
