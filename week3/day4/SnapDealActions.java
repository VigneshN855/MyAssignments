package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDealActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='menuLinks leftCategoriesProduct ']//span[@class='catText'])[1]"))).perform();
		driver.findElement(By.xpath("(//p//span[@class='linkTest'])[1]")).click();
		String CountSports = driver.findElement(By.xpath("//ul[@id='js-46105685-nav']//following::div[@class='sub-cat-count ']")).getText();
		System.out.println("Count of sports shoes: "+CountSports);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		WebElement From = driver.findElement(By.name("fromVal"));
		From.clear();
		From.sendKeys("500");
		WebElement To = driver.findElement(By.name("toVal"));
		To.clear();
		To.sendKeys("700");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		WebElement Color = driver.findElement(By.xpath("//a[text()=' Black']"));
		wait.until(ExpectedConditions.elementToBeClickable(Color));
		driver.executeScript("arguments[0].click();", Color);
		act.moveToElement(driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"))).perform();
		WebElement Quick = driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(Quick));
		driver.executeScript("arguments[0].click();", Quick);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']//span"));
		for(WebElement ele: elements) {
			System.out.println(ele.getText());
		}
	}

}
