package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\New Chrome Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
//===========================================================================================================================================================================
//		for drop down of Tag name "select" in HTML code
		
		WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		method(Skills,"APIs");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		method(year, "1997");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		method(month, "May");
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
		method(day, "19");
		
		Thread.sleep(2000);
//===========================================================================================================================================================================
//		for drop down not having tag name as "select"
		
		driver.findElement(By.xpath("//div[@id='msdd']"));	//Locating language drop down

//		(1) Getting all options from Language drop down using "findElements" and it's return type is List<WebElement>
		List<WebElement> language = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']"));
//						 System.out.println("Number of options in Language Dropdown are: "+language.size());
		
		method2(language, "English");
		
//		(2) First locating select country and then getting all options of 
//		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		
	}

	public static void method(WebElement element, String value) {	//This method is only applicable for drop down of tag name "select"

		Select sel = new Select(element);

		List<WebElement> dropDown = sel.getOptions();

		for (WebElement ele : dropDown) {

			if (ele.getText().equals(value)) {

				ele.click();
				break;

			}

		}

		
	}
	
	public static void method2(List<WebElement> language, String value) {	//This method is only applicable for drop down of tag name other than "select"
		
		List<WebElement> lang = language;
		
		for(WebElement ele : lang) {
			
			if(ele.getText().equals(value)) {
				
				ele.click();
				break;
				
			}
		}
		
		
		
	}
	

}
