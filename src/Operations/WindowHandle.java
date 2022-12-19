package Operations;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\simantikam\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		WebElement clickHere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		clickHere.click();
		clickHere.click();
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		Thread.sleep(5000);
		for(String handle1:handles)
		{
			driver.switchTo().window(handle1);
			if(handle1.equalsIgnoreCase(handle))
			{
				continue;
			}
			else
				driver.close();
		}
		
		
	}

}
