import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidLogin {

	public static void main(String[] args) {
	 

		
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver wd= new ChromeDriver();
		 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
			
		// Scenario- To login to a page
		String baseUrl = "hhttps://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		wd.get(baseUrl);
		
		WebElement userName = wd.findElement(By.xpath("//div/input[@name='txtUsername']"));
		userName.sendKeys("Admin");
		  
		WebElement pass = wd.findElement(By.xpath("//div/input[@name='txtPassword']"));
		pass.sendKeys("admin123");
		
		WebElement login = wd.findElement(By.xpath("//div/input[@type='submit']"));
		login.click();
		 
	 
	}


	}


