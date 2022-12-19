package Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\simantikam\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		org.openqa.selenium.Alert alert1=driver.switchTo().alert();
		alert1.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		org.openqa.selenium.Alert alert2=driver.switchTo().alert();
		Thread.sleep(5000);
		alert2.dismiss();
		
		WebElement element=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
        org.openqa.selenium.Alert promptAlert  = driver.switchTo().alert();
        String alertText = promptAlert.getText();
        System.out.println("Alert text is " + alertText);
       //Send some text to the alert
        promptAlert.sendKeys("Test User");
        promptAlert.accept();
		
		
	}

}
