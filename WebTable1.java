package WebTableHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\New Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
		
		Thread.sleep(2000);
		
		WebElement datePicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
		datePicker.click();
		
		Thread.sleep(2000);
		
		String Month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		Thread.sleep(2000);
		String r = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr[1]")).getText();
		System.out.println(r);
		
		System.out.println("Length of the row is: "+r.length());
		
		String s = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr[1]//td")).getText();
		System.out.println(s);
		
		for(int i=2; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				
				System.out.print(driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr["+i+"]//td["+j+"]")));
			}
			System.out.println();
		}
		
		
	}

}
