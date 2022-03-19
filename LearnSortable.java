package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println(driver.getTitle());

		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		Thread.sleep(3000);
		Actions build = new Actions(driver);
		build.dragAndDrop(item3, item1).perform();

	}

}
