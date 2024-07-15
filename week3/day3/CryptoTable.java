package week3.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CryptoTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		WebElement Market = driver.findElement(By.xpath("//span[text()='Markets']"));
		action.moveToElement(Market).perform();
		
		driver.findElement(By.xpath("//span[text()='Markets']//following::div[text()='Crypto']")).click();
		List<WebElement> tableHead = driver.findElements(By.xpath("//table//tr"));
		int size = tableHead.size();
		System.out.println(size);
		
		
	}

}
