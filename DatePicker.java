package task10.GuviTask_10;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("datepicker")).click();
	   
	    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	    WebElement x=driver.findElement(By.xpath("//a[text()='22']"));
	    x.click();
	    String a=x.getText();
	    System.out.println(a);
	    driver.quit();
	    
	    
	}

}
