package Day_9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Output_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s=new Select(fruits);
		List<WebElement> op = s.getOptions();
		for (int i = 0; i <op.size(); i++) {
			if(i%2==0)
			{
			WebElement w = op.get(i);
			String text = w.getAttribute("value");
			s.selectByValue(text);
		  }else {
			  WebElement w = op.get(i);
				String text = w.getAttribute("value");
				System.out.println(text);
		  }	
	}
	}
}
