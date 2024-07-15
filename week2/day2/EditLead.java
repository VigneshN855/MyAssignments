package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BoFA");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sandy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sathish");
		driver.findElement(By.name("firstNameLocal")).sendKeys("San");
		driver.findElement(By.name("departmentName")).sendKeys("Automation");
		driver.findElement(By.name("primaryEmail")).sendKeys("san@gmail.com");
		driver.findElement(By.name("description")).sendKeys("Editing the description");
		Select State = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		State.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("removed the description");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
