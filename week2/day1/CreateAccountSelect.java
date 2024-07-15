package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelect {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("Kishore");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Select Industry = new Select(driver.findElement(By.name("industryEnumId")));
		Industry.selectByIndex(3);
		Select Ownership = new Select(driver.findElement(By.name("ownershipEnumId")));
		Ownership.selectByVisibleText("S-Corporation");
		Select Source = new Select(driver.findElement(By.name("dataSourceId")));
		Source.selectByValue("LEAD_EMPLOYEE");
		Select Market = new Select(driver.findElement(By.name("marketingCampaignId")));
		Market.selectByIndex(6);
		Select State = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		State.selectByValue("TX");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
	}

}
