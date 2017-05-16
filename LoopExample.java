import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		 String baseUrl = "http://facebook.com";
		driver.get(baseUrl);
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("xxxx");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("xxxx");
		
		WebElement identifier = driver.findElement(By.xpath(".//*[@id='month']"));
		Select select1 = new Select(identifier);
		select1.selectByVisibleText("Sep");
		
		WebElement identifier1 = driver.findElement(By.xpath(".//*[@id='day']"));
		Select select2 = new Select(identifier1);
		select2.selectByVisibleText("9");
		
		WebElement identifier2 = driver.findElement(By.xpath(".//*[@id='year']"));
		Select select3 = new Select(identifier2);
		select3.selectByVisibleText("1992");
	}

}

