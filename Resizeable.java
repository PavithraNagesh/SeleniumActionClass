package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizeable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println(driver.getTitle());
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		System.out.println(frame);
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']"));
		Actions build = new Actions(driver);
		Point location = resize.getLocation();
		System.out.println(location);
		int x = location.getX();
		int y = location.getY();
		build.dragAndDropBy(resize, x+70, y+30).perform();

	}

}
