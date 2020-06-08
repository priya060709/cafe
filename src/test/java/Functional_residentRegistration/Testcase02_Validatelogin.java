package Functional_residentRegistration;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase02_Validatelogin {

	@Test
	public void Login() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver	= new ChromeDriver();
		driver.get("http://google.com");		
		driver.quit();
	}

}
