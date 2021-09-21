package week3day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignImplementListAjio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();

		Thread.sleep(2000);
		WebElement items = driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println("The Total items found are:" + items.getText());

		List<WebElement> brands = driver
				.findElements(By.xpath("//div[@class='item rilrtl-products-list__item item']//div[@class='brand']"));

		int size = brands.size();

		System.out.println("The Total brands found are:" + size);
		for (int i = 0; i < size; i++) {

			String brandName = brands.get(i).getText();
			System.out.println(("Brands are : " + brandName));
		}

		List<WebElement> names = driver
				.findElements(By.xpath("//div[@class='item rilrtl-products-list__item item']//div[@class='name']"));
		int nameSize = names.size();
		System.out.println("The Total brands found are:" + nameSize);
		for (int j = 0; j < size; j++) {
			String bagName = names.get(j).getText();
			
			System.out.println("Bag names are  " + bagName);

		}	
	}

}
