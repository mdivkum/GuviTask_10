package task10.GuviTask_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Guvi {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.guvi.in/");
		Thread.sleep(1000);
		WebElement signup=driver.findElement(By.xpath("//a[text()='Sign up']"));
	//wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signup));
		signup.click();
		driver.findElement(By.id("name")).sendKeys("Jeeees");
	    driver.findElement(By.id("email")).sendKeys("jeeedh@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Abc1234");
	    driver.findElement(By.id("mobileNumber")).sendKeys("9087654322");
	    driver.findElement(By.id("signup-btn")).click();
	    driver.findElement(By.id("laterBtn")).click();
	    driver.navigate().to("https://www.guvi.in/");
	    driver.findElement(By.id("login-btn")).click();
	    driver.findElement(By.id("email")).sendKeys("jeeedh@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Abc1234");
	    driver.findElement(By.id("login-btn")).click();
	    driver.close();
	}

}
