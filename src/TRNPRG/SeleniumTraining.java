package TRNPRG;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class SeleniumTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\simantikam\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
			
		WebElement searchBar=driver.findElement(By.className("desktop-searchBar"));
		searchBar.sendKeys("Allen Solly");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementValue(searchBar,"Allen Solly"));
		searchBar.sendKeys(Keys.ENTER);
		
				
		List<WebElement> list=driver.findElements(By.xpath("//span[text()='(50% OFF)']"));
		
		wait.until(ExpectedConditions.visibilityOfAllElements(list));
		
		int numberOfElements=list.size();
		System.out.println("Number of Allen Solly items is: " + numberOfElements );
		  
		
		
	    
		

	}
	
	
	
}
