package TestAppLaunch;


import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AppLaunch {

	private static WebDriver driver;
	@Test
	public void appLaunchTest() {
		//Launch App
	driver= new ChromeDriver();
	driver.get("https://www.linkedin.com/");
	driver.manage().window().maximize();
	//Check website URL name
	String actualTitle = driver.getTitle();
    String expectedTitle = "LinkedIN:Log In or Sign Up";
    
    //Verify URL name
    assertEquals(expectedTitle, actualTitle, "Page title does not match!");
	
	}
	 @AfterClass
	    public static void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	 	}
}
