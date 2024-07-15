package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("u_0_0_lG")).click();
		driver.findElement(By.name("firstname")).sendKeys("Kishore");
		driver.findElement(By.name("lastname")).sendKeys("Nandha");
		driver.findElement(By.id("u_4_g_7j")).sendKeys("9856261247");
		driver.findElement(By.id("password_step_input")).sendKeys("Password");
		Select Day = new Select(driver.findElement(By.name("birthday_day")));
		Day.selectByValue("26");
		Select Month = new Select(driver.findElement(By.name("birthday_month")));
		Month.selectByIndex(7);
		Select Year = new Select(driver.findElement(By.name("birthday_year")));
		Year.selectByVisibleText("1996");
		driver.findElement(By.xpath("//input[@id='u_4_5_tx']")).click();
	}

}
