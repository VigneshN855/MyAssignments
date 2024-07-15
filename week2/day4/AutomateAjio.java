package week2.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAjio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//strong[text()=' Items Found']")).getText());
		
		System.out.println("======Finding the List of the Elements===========");
		
		List<WebElement> Brands = driver.findElements(By.xpath("//div[@class='brand']"));
		
		for(WebElement BrandList: Brands ) {
			System.out.println(BrandList.getText());
		}
	}

}
