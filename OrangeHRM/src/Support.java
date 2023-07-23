
public class Support {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
	 WebDriver wd= new ChromeDriver();
	 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
	// Scenario- To login to a page
	String baseUrl = "hhttps://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	wd.get(baseUrl);
	
	WebElement userName = wd.findElement(By.xpath("//div/input[@name='txtUsername']"));
	userName.sendKeys("Admin");
	
	WebElement support = wd.findElement(By.partialLInkText("/web/index.php/help/support']"));
 
	
	WebElement support = wd.findElement(By.xpath("//div/input[@type='submit']"));
	support.click();
	

}
