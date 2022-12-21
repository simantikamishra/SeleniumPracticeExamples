package TRNPRG;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.netty.util.Timeout;



public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\simantikam\\eclipse-workspace\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		   
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
		
		Actions action=new Actions(driver);
		WebElement A=driver.findElement(By.id("column-a"));
		WebElement B=driver.findElement(By.id("column-b"));
		
		action.dragAndDrop(A, B).build().perform();
		//action.moveToElement(A);
		//action.clickAndHold(A);
		//action.dragAndDrop(A, B).perform();
		
		
		
	}

}
