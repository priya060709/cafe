package Functional_residentRegistration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase01_loginpage {

	@Test
	public void Login() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver	= new ChromeDriver();
		driver.get("http://google.com");		
		driver.quit();
	}

}
