import org.openqa.selenium.chrome.ChromeDriver;

public class windowactivities {

	
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				
				System.setProperty("webdriver.chrome.driver",
						"C:\\\\Users\\\\RakeshPatil\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.get("http://google.com");
			    driver.navigate().to("https://rahulshettyacademy.com");
			    driver.navigate().back();
			    driver.navigate().forward();
			    
			}

}


