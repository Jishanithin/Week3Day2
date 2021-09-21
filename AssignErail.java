package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignErail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MS", Keys.ENTER);

		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU", Keys.ENTER);

		WebElement sortDate = driver.findElement(By.id("chkSelectDateOnly"));
		sortDate.click();
Thread.sleep(2000);
		List<WebElement> trainNum = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));
		int num = trainNum.size();
		System.out.println("Total NUm of trains are " + num);
		for (WebElement webelement:trainNum) {
			System.out.println("Train numbers are " + webelement.getText());
		}

		List<WebElement> trainName = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));

		int size = trainName.size();
		System.out.println("The number of trains are : " + size);
		List<String> tName = new ArrayList<String>();
		for (WebElement trainlist : trainName) {

			String name = trainlist.getText();
			tName.add(name);
		}
		Collections.sort(tName);
		System.out.println(("Train Names are : " + tName));

		
	}

}
