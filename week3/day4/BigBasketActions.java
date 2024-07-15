package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasketActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']")).click();
		Actions action = new Actions(driver);
		WebElement Product = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(Product));
		action.moveToElement(Product).perform();
		Thread.sleep(5000);
		WebElement SubProduct = driver.findElement(By.xpath("(//a[text()='Rice & Rice Products'])[1]"));
		//wait.until(ExpectedConditions.elementToBeClickable(SubProduct));
		action.moveToElement(SubProduct).perform();
		driver.findElement(By.xpath("(//a[text()='Boiled & Steam Rice'])[1]")).click();
//		WebElement Brand = driver.findElement(By.xpath("//span[text()='Brands']/following::label[text()='BB Royal']"));
//		driver.executeScript("arguments[0].scrollIntoView(true);", Brand); 
//		Brand.click();
		driver.findElement(By.xpath("//img[contains(@title,'Tamil Ponni Boiled')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		WebElement Weight = driver.findElement(By.xpath("//span[text()='5 kg']"));
		wait.until(ExpectedConditions.elementToBeClickable(Weight));
		driver.executeScript("arguments[0].scrollIntoView(true);", Weight);
		Weight.click();
		WebElement Add = driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(Add));
		driver.executeScript("arguments[0].click();", Add);
		WebElement SuccMsg = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']"));
		wait.until(ExpectedConditions.visibilityOf(SuccMsg));
		String Mess = SuccMsg.getTagName();
		System.out.println(Mess);
		driver.close();
		driver.switchTo().window(windows.get(0));
		driver.close();
	}

}
