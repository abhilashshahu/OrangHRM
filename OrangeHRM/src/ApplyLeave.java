import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ApplyLeave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver wd= new ChromeDriver();
		 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		 
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
			 WebDriver wd1= new ChromeDriver();
			 wd1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
				
			// Scenario- To login to a page
			String baseUrl = "hhttps://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			wd1.get(baseUrl);
			
			WebElement userName = wd1.findElement(By.xpath("//div/input[@name='txtUsername']"));
			userName.sendKeys("Admin");
			  
			WebElement pass = wd1.findElement(By.xpath("//div/input[@name='txtPassword']"));
			pass.sendKeys("admin123");
			
			WebElement login = wd1.findElement(By.xpath("//div/input[@type='submit']"));
			login.click();
			 
			WebElement Viewleave=wd1.findElement(By.xpath("//div/input[@type='//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a']"));
			Viewleave.click();
			
	}
				
			public void ApplyLeave() {	
				WebDriver wd= new ChromeDriver();
	 	
		WebElement applyleave=wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a']"));
		applyleave.click();
		
		}
			public void ClickLeaveTypeDropdown() {
				WebDriver wd= new ChromeDriver();
			 	
				WebElement  ClickDropdown=wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a']"));
				ClickDropdown.click();
				
				
			 Select drpCountry = new Select(wd.findElement(By.name("Leave Type")));
  

				drpCountry.selectByVisibleText("CAN-Personal");
			}
				public void FromAndToDate()
				{
				
				String date = "22-Jul-2023";
				String[] dateElements = date.split("/");

				String dayFromUserInput = dateElements[0];
				String monthFromUserInput = dateElements[1];
				String yearFromUserInput = dateElements[2];


				List<> <WebElement> monthlist=getDriver().findElements(By.xpath("<input class=\"oxd-input oxd-input--active\" placeholder=\"yyyy-mm-dd\" data-v-1f99f73c=\"\" data-v-4a95a2e0=\"\">']/following::ul[@class='oxd-calendar-dropdown']"));
				int i=0;
				int j=0;
				for (WebElement ele : monthlist) {
				    System.out.println(ele.getText());
				    String[] fbmonth = ele.getText().trim().split("\n");
				    for(i=0;i<fbmonth.length;i++) {
				    
				        System.out.println("fbmonth" +i +"="+ fbmonth[i] );
				        if (fbmonth[i].equals(monthFromUserInput)) {
				            
				            WebElement m=getDriver().findElement(By.xpath(fbmonth[i]));
				            
				            action.scrollByVisibilityOfElement(getDriver(), m);
				            action.moveToElement(getDriver(), m);
				            action.JSClick(getDriver(), m);
				            
				            System.out.println(fbmonth[i] + "From Date is selcted");
				            
				            
				            List<> <WebElement> monthlist=getDriver().findElements(By.xpath("<input class=\"oxd-input oxd-input--active\" placeholder=\"yyyy-mm-dd\" data-v-1f99f73c=\"\" data-v-4a95a2e0=\"\">']/following::ul[@class='oxd-calendar-dropdown']"));
							int i=0;
							int j=0;
							for (WebElement ele : monthlist) {
							    System.out.println(ele.getText());
							    String[] fbmonth = ele.getText().trim().split("\n");
							    for(i=0;i<fbmonth.length;i++) {
							    
							        System.out.println("fbmonth" +i +"="+ fbmonth[i] );
							        if (fbmonth[i].equals(monthFromUserInput)) {
							            
							            WebElement m=getDriver().findElement(By.xpath(fbmonth[i]));
							            
							            action.scrollByVisibilityOfElement(getDriver(), m);
							            action.moveToElement(getDriver(), m);
							            action.JSClick(getDriver(), m);
							            
							            System.out.println(fbmonth[i] + "TO Date is selcted");
				            
			}
							        
							        public void Search()
							        {
							        	
							        	WebDriver wd= new ChromeDriver();
							    		WebElement commens = wd.findElement(By.xpath(//*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[1]/label]"));
							    		userName.sendKeys("Applying Leave for personal issues"));
							    		  
							    		WebElement Apply = wd.findElement(By.id"(submit");444
							    		Apply.click();
							        }
							        public void Reset()
							        {
							        	
							        	WebDriver wd= new ChromeDriver();
							    		WebElement commens = wd.findElement(By.xpath(//*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[1]/label]"));
							    		userName.sendKeys("Applying Leave for personal issues"));
							    		  
							    		WebElement Apply = wd.findElement(By.id"(resetsubmit");
							    		Apply.click();
							    		

				    
				    
				    
				    
				    
				}
				

