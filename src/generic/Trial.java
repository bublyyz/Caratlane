package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Trial {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\crm\\Zoho\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.caratlane.com/");
		
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.name("login[username]")).sendKeys("shani.darsh18231@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("caratlane");
		driver.findElement(By.id("send2")).submit();
	
		
		String xp="//a/span[.='GOLD JEWELLERY']";
		WebElement menu = driver.findElement(By.xpath(xp));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();		
	
		driver.findElement(By.linkText("Gold Earrings")).click();
		
		driver.findElement(By.linkText("Rs.5001 To Rs.10000")).click();
		
		//driver.findElement(By.xpath("//div/div[@class='close']")).click();
		
		driver.close();
	}

}
