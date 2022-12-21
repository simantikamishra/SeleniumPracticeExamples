package Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\simantikam\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
		WebElement listbox=driver.findElement(By.id("dropdown"));
		
		Select osel=new Select(listbox);
		//osel.selectByIndex(1);
		//osel.selectByValue("2");
		osel.selectByVisibleText("Option 1");
		
		List<WebElement> allOptions=osel.getOptions();
		int sizeList=allOptions.size();
		System.out.println(sizeList);
		
		
		for(int i=0;i<sizeList;i++)
		{
			String text=allOptions.get(i).getText();
			System.out.println(text);
		}
		
		
		
		
	}

}
