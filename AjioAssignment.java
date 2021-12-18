package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.className("ic-search")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
	
		List<WebElement> listOfbrands = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.print("Total number of brands: ");
		System.out.println(listOfbrands.size());
		System.out.println("Brands are:");
		int i = 0;
		for(WebElement brands:listOfbrands)
		{
			i= i+1;
			System.out.println(i+"."+brands.getText());
		}
		
//			WebElement copyrightAtEndOfPage = driver.findElement(By.xpath("//div[contains(text(),'Payment Methods')]"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", copyrightAtEndOfPage);
//		
		List<WebElement> listOfProducts = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.print("Total number of Products: ");
		System.out.println(listOfProducts.size());
		System.out.println("Products are:");
		
		int j=0;
		for (WebElement Products:listOfProducts){
			j= j+1;
			System.out.println(j+"."+Products.getText());

		}

		}

	}
