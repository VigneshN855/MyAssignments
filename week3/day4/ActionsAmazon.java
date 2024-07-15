package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		String firstPdtPrice = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
		System.out.println(firstPdtPrice);
		driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-3']//a")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandle);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		WebElement subCartPrice = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(subCartPrice));
		System.out.println(subCartPrice.getText());
		String Sub = subCartPrice.getText();
		if(Sub.equals("₹"+firstPdtPrice+".00")) {
			System.out.println(firstPdtPrice+" is equal to "+Sub);
		} else {
			System.out.println(firstPdtPrice+" is not equal to "+Sub);
		}
	}

}
