package TRNPRG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOrListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\simantikam\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
		WebElement dropdown=driver.findElement(By.id("dropdown"));
		Select osel=new Select(dropdown);
		//osel.selectByIndex(2);
		//osel.selectByValue("1");
		osel.selectByVisibleText("Option 2");
		
		// To count the number of options in a dropdown
		List<WebElement> allOptions=osel.getOptions();
		int listSize=allOptions.size();
		System.out.println(listSize);
		
		//To fetch all options from listbox
		for(int i=0;i<listSize;i++)
		{
			String textString=allOptions.get(i).getText();
			System.out.println(textString);
		}
		
		//To find out if a listbox is multiselect
		System.out.println(osel.isMultiple());
		
		//To deselect an option
		osel.deselectByVisibleText("Option 2");
		
		
		
		
		
	}

}
