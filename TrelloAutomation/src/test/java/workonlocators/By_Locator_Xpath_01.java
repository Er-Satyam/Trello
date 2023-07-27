package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Locator_Xpath_01 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		//find the register button
		WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
		Thread.sleep(5000);
		registerButton.click();
		
Thread.sleep(4000);
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
