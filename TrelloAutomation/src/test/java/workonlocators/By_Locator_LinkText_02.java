package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Locator_LinkText_02 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		//identify the Forgot your password? option
		
		
//		WebElement forgotPasswordOption = driver.findElement(By.id("toPasswordRecoveryPageLink"));
//		forgotPasswordOption.click();
		//NoSuchElementException
		
		
//		WebElement forgotPasswordOption = driver.findElement(By.linkText("Forgot your password?"));
		
		
		WebElement forgotPasswordOption = driver.findElement(By.partialLinkText("Forgot your password"));
		forgotPasswordOption.click();
		
Thread.sleep(4000);
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
