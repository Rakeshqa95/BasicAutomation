package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh_Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
		System.out.println(driver.findElements(By.tagName("a")).size());  
	
		WebElement footdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footdriver.findElements(By.tagName("a")).size());
		

          WebElement coloumndriver=footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
            System.out.println(coloumndriver.findElements(By.tagName("a")).size());

        for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
      {
        
        	String clickonlinkTab =Keys.chord(Keys.CONTROL,Keys.ENTER);
        	coloumndriver.findElements(By.tagName("a")).get(i).sendKeys("clickonlinkTab");
        	
              Thread.sleep(5000L);
          
       }
		
	}

}
