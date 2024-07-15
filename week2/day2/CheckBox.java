package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		WebElement Basic = driver.findElement(By.xpath("//span[text()='Basic']"));
		Basic.click();
		boolean result1 = Basic.isEnabled();
		System.out.println("Checking if the checkbox is enabled: "+result1);
		WebElement Notification = driver.findElement(By.xpath("//span[text()='Ajax']"));
		Notification.click();
		boolean result2 = Notification.isEnabled();
		System.out.println("Checking if the checkbox is enabled: "+result2);
		System.out.println(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed());
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		WebElement TriState = driver.findElement(By.id("j_idt87:ajaxTriState"));
		TriState.click();
		TriState.click();
		System.out.println(driver.findElement(By.xpath("//p[text()='State = 2']")).getText());
		boolean result3 = TriState.isEnabled();
		System.out.println("Checking if the checkbox is enabled: "+result3);
		WebElement Toggle = driver.findElement(By.id("j_idt87:j_idt100"));
		Toggle.click();
		boolean result4 = Toggle.isEnabled();
		System.out.println("Checking if the checkbox is enabled: "+result4);
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed());
		System.out.println(driver.findElement(By.id("j_idt87:j_idt102")).isSelected());
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//label[text()='Berlin']")).click();
	}

}
