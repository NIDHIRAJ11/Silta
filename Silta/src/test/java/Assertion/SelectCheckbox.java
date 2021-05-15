package Assertion;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckbox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	
	{
		System.out.print("enter the url : ");  
		Scanner sc=new Scanner(System.in);
		String url=sc.nextLine();
		// opening the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		// selecting all check boxes 
		List<WebElement> chckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement chbox:chckBox)
		{
			// selecting or clicking checkbox one by one
			chbox.click();
		}
		
		driver.close();

	}

}
