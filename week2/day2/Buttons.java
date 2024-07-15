package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle());
		driver.get("https://leafground.com/button.xhtml");
		WebElement Disabled = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean result = Disabled.isEnabled();
		System.out.println(result);
		System.out.println(driver.findElement(By.id("j_idt88:j_idt94")).getLocation());
		System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.id("j_idt88:j_idt98")).getSize());
	}

}
